SET search_path TO naforma1;

// NOTE: In the below, "plots" always implies planned, accessible plot centers

// No. clusters per stratum with >=1 plot (ncluster2) (count>=0)
alter table _country_stratum
add column cluster_cnt integer;
 
with cnt as (
        select 
                s.stratum,
                p.country_id,
                count(distinct p.cluster_id) as count   
        from
                _country_stratum s
        left outer join
                _plot p
                on s.stratum = p.stratum
        where
                p.accessibility = '0' and 
                p.measurement = 'P' and 
                p.subplot = 'A' and
                p.country_id is not null
        group by
                s.stratum,
                p.country_id        
)
update 
        _country_stratum
set 
        cluster_cnt = cnt.count
from
        cnt
where         
        cnt.country_id = _country_stratum.country_id
and 
        cnt.stratum = _country_stratum.stratum;

drop table if exists _tmp_cluster_x_class;

create table _tmp_cluster_x_class
as
select distinct
    p.cluster_id,
    p.stratum,
    v.land_use as land_use
from
    _plot p, 
    land_use_code v
;

// No. plots per class per cluster (nplots_k > 0)
drop table if exists _tmp_plots_per_class_per_cluster;

create table _tmp_plots_per_class_per_cluster as
select
    c.cluster_id,
    c.stratum,
    c.land_use,
    count(p.plot_id)    
from
    _tmp_cluster_x_class c
left outer join    
    _plot p
    on c.cluster_id = p.cluster_id
    and p.accessibility = '0' 
    and p.measurement = 'P' 
    and p.subplot = 'A' 
    and p.land_use = c.land_use
    -- is not null    
group by
    c.cluster_id,
    c.stratum,
    c.land_use;
    
// No. plots per class per stratum (plots_k > 0)
drop table if exists _tmp_plots_per_class_per_stratum;

create table _tmp_plots_per_class_per_stratum as
select
    stratum,
    land_use,
    sum(count) as count
from
    _tmp_plots_per_class_per_cluster
group by
    stratum,
    land_use;
    
// Area per class per stratum (area_k > 0)
drop table if exists _tmp_area_per_class_per_stratum;

create table _tmp_area_per_class_per_stratum as
select
    stratum,
    land_use,
    sum(est_area) as area
from
    _country_stratum_plot_agg
group by
    stratum,
    land_use;
 
 // No. plots per cluster (nplots > 0)
drop table if exists _tmp_plots_per_cluster;

create table _tmp_plots_per_cluster as
select
    cluster_id,
    stratum,
    sum(count) as count
from
    _tmp_plots_per_class_per_cluster
group by
    cluster_id,
    stratum;

// Proportion of plots per class per stratum (plots_k / no. obs. plots in stratum > 0)
drop table if exists _tmp_plots_prop_class_per_stratum;

create table _tmp_plots_prop_class_per_stratum as 
select
    ps.stratum,
    ps.land_use,
    ps.count / s.obs_plot_cnt as prop
from
    _tmp_plots_per_class_per_stratum ps
inner join
    _country_stratum s
on ps.stratum = s.stratum;

// Expected no. plots per class per cluster (proportion * nplots > 0)
drop table if exists _tmp_exp_plots_per_class_per_cluster;

create table _tmp_exp_plots_per_class_per_cluster as 
select    
    c.cluster_id,
    s.stratum,
    s.land_use,    
    s.prop * c.count as expected_cnt
from
    _tmp_plots_prop_class_per_stratum s
inner join
    _tmp_plots_per_cluster c
on
    s.stratum = c.stratum
;
    
// Residuals per class per cluster (difference in no. plots in each class observed vs. estimated >= 0)
drop table if exists _tmp_area_residuals_per_class_per_cluster;

create table _tmp_area_residuals_per_class_per_cluster as 
select    
    o.cluster_id,
    o.stratum,
    o.land_use,    
    o.count - e.expected_cnt as residual
from
     _tmp_plots_per_class_per_cluster o
inner join
    _tmp_exp_plots_per_class_per_cluster e
on
    o.cluster_id = e.cluster_id and
    o.land_use = e.land_use    
;

// Variance of cluster residuals per class per stratum
// null when one or no clusters in class in stratum

drop table if exists _tmp_stratum_x_class;

create table _tmp_stratum_x_class as
select distinct
    stratum,
    land_use as land_use
    from naforma1._tmp_cluster_x_class s;

drop table if exists _tmp_area_var_per_class_per_stratum;

create table _tmp_area_var_per_class_per_stratum as 
select
    x.stratum,
    x.land_use,
    var_samp(residual) var
from
    _tmp_stratum_x_class x
left outer join    
    _tmp_area_residuals_per_class_per_cluster r
    on x.stratum = r.stratum and x.land_use = r.land_use
group by
    x.stratum,
    x.land_use
;

       
// Coefficient of variation per stratum per class
// strata$erprc <- (strata$ncluster2 * strata$residual_variance_k) / (strata$nplot2oc ^ 2)
// cv is null when variance is null (i.e. only one cluster)
drop table if exists _tmp_area_cv_per_class_per_stratum;

create table _tmp_area_cv_per_class_per_stratum as 
select
    r.stratum,
    r.land_use,
    (s.cluster_cnt * r.var) / (s.obs_plot_cnt^2) as cv
from    
    _tmp_area_var_per_class_per_stratum r
left outer join
    _country_stratum s
on
    r.stratum = s.stratum        
;
// handle incomplete AOIs
// mean CV by class
drop table if exists _tmp_mean_area_cv_per_class;

create table _tmp_mean_area_cv_per_class as 
select
    cv.land_use,
    avg(cv.cv) as mean_cv
from    
    _tmp_area_cv_per_class_per_stratum cv 
group by
    cv.land_use
;

// replace missing CVs with mean CV 
// "this trick is not recommended" (E. Tomppo, 2012)
update 
    _tmp_area_cv_per_class_per_stratum AS cv
set
    cv = m.mean_cv
from 
    _tmp_mean_area_cv_per_class m
where
    cv.land_use = m.land_use
    and cv.cv is null
;

// Absolute error per class 
// errors$absolute <- sqrt(sum(strata$area_k^2 * strata$erprc))
drop table if exists _tmp_area_abs_err_per_class;

create table _tmp_area_abs_err_per_class as 
select
    c.land_use,
    sqrt(sum(c.cv * a.area^2)) as aerr
from    
    _tmp_area_cv_per_class_per_stratum c
inner join
    _tmp_area_per_class_per_stratum a
    on
    c.land_use = a.land_use and
    c.stratum = a.stratum
group by
    c.land_use
;

// Relative error (cv) per class = err / total area of class in AOI
// errors$relative <- errors$absolute / sum(strata$area_k)								 
drop table if exists _tmp_area_rel_err_per_class;

create table _tmp_area_rel_err_per_class as 
select
    e.land_use,
    e.aerr / sum(area) * 100 as rerr
from    
    _tmp_area_abs_err_per_class e
inner join
    _tmp_area_per_class_per_stratum a
    on e.land_use = a.land_use
group by
    e.land_use,
    e.aerr
;

