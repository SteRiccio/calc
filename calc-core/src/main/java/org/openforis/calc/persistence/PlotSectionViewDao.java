package org.openforis.calc.persistence;

import static org.openforis.calc.persistence.jooq.Tables.PLOT_CATEGORICAL_VALUE_VIEW;
import static org.openforis.calc.persistence.jooq.Tables.PLOT_EXPANSION_FACTOR;
import static org.openforis.calc.persistence.jooq.Tables.PLOT_SECTION_AOI;
import static org.openforis.calc.persistence.jooq.Tables.PLOT_SECTION_VIEW;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.jooq.Field;
import org.jooq.JoinType;
import org.jooq.Record;
import org.jooq.SelectQuery;
import org.jooq.Table;
import org.jooq.impl.Factory;
import org.openforis.calc.io.flat.FlatDataStream;
import org.openforis.calc.io.flat.FlatRecord;
import org.openforis.calc.model.VariableMetadata;
import org.openforis.calc.persistence.jooq.JooqDaoSupport;
import org.openforis.calc.persistence.jooq.tables.PlotCategoricalValueView;
import org.openforis.calc.persistence.jooq.tables.PlotExpansionFactor;
import org.openforis.calc.persistence.jooq.tables.PlotSectionAoi;
import org.openforis.calc.persistence.jooq.tables.PlotSectionView;
import org.openforis.calc.persistence.jooq.tables.records.PlotSectionViewRecord;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author G. Miceli
 * @author M. Togna
 */
@Component
@Transactional
public class PlotSectionViewDao extends JooqDaoSupport<PlotSectionViewRecord, PlotSectionView> {

	private static final String PLOT_DISTRIBUTION_COLUMN_NAME = "plot_distribution";
	private static final String EST_AREA_COLUMN_NAME = "est_area";
	private static final PlotSectionView V = PLOT_SECTION_VIEW;
//	private static final Aoi A = AOI;
	private static final PlotSectionAoi PSA = PLOT_SECTION_AOI;
	
	public PlotSectionViewDao() {
		super(V, PlotSectionView.class, V.PLOT_OBS_UNIT_ID, V.CLUSTER_CODE, V.PLOT_NO, V.PLOT_SECTION, V.VISIT_TYPE);
	}

	public Integer getId(int obsUnitId, String clusterCode, int plotNo, String plotSection, String visitType) {
		return getIdByKey(obsUnitId, clusterCode, plotNo, plotSection, visitType);
	}

	@Override
	protected Field<?> pk() {
		return V.PLOT_SECTION_ID;
	}

	public Object[] extractKey(FlatRecord r, int obsUnitId) {
		return extractKey(r, obsUnitId, V.CLUSTER_CODE, V.PLOT_NO, V.PLOT_SECTION, V.VISIT_TYPE);
	}

	public FlatDataStream streamAll(String[] fields, int observationUnitId) {
		return stream(fields, V.PLOT_OBS_UNIT_ID, observationUnitId);
	}
	
	@SuppressWarnings("unchecked")
	public FlatDataStream streamAreaFactData(Collection<VariableMetadata> variables, int obsUnitId, boolean useShares){
		Factory create = getJooqFactory();
		SelectQuery query = getPlotCategoryDistributionQuery(variables, obsUnitId, create);
		
		PlotExpansionFactor e = PLOT_EXPANSION_FACTOR.as("e");
		
		query.addJoin(e, 
						e.AOI_ID.eq( PSA.AOI_ID )
						.and( V.STRATUM_ID.eq(e.STRATUM_ID) )
//						e.STRATUM_ID.eq( V.STRATUM_ID )
//						.and( e.AOI_ID.eq(A.AOI_ID) )
					);
		
		
		Field<? extends Number> plotDistr = null;
		if(useShares) {
			plotDistr = V.PLOT_SHARE.div(100).sum();
		} else {
			plotDistr = V.PLOT_SECTION_ID.count();
			query.addConditions( V.PRIMARY_SECTION.eq(true) );
		}
		query.addSelect( e.EXP_FACTOR.mul(plotDistr).as( EST_AREA_COLUMN_NAME ) );
		
		query.addGroupBy( e.EXP_FACTOR );
		
		Table<Record> estAreaTable = query.asTable().as("est_area_table");
		
		SelectQuery aggrQuery = create.selectQuery();
		aggrQuery.addFrom(estAreaTable);
		//keep category
		List<Field<?>> fieldsToKeep = new ArrayList<Field<?>>();
		for ( Field<?> field : estAreaTable.getFields() ) {
			if( !( field.getName().equals( V.STRATUM_ID.getName() ) || field.getName().equals( EST_AREA_COLUMN_NAME ) 
					|| field.getName().equals( PLOT_DISTRIBUTION_COLUMN_NAME ) || field.getName().equals( e.EXP_FACTOR ) ) ) {
				fieldsToKeep.add( field );
			}
		}
		for ( Field<?> field : fieldsToKeep ) {
			aggrQuery.addSelect(Factory.coalesce(field, -1).as( field.getName() ) );
		}
//		aggrQuery.addSelect( fieldsToKeep );
		aggrQuery.addGroupBy( fieldsToKeep );
		aggrQuery.addSelect( estAreaTable.getField( EST_AREA_COLUMN_NAME ).sum().as( EST_AREA_COLUMN_NAME ) );
		
		if ( getLog().isDebugEnabled() ) {
			getLog().debug("Creating area fact table");
			getLog().debug(aggrQuery.toString());
		}
		
		return stream( aggrQuery.fetch() );
	}
	
	public FlatDataStream streamCategoryDistribution(Collection<VariableMetadata> variables, int obsUnitId, boolean useShares){
		Factory create = getJooqFactory();
		SelectQuery query = getPlotCategoryDistributionQuery(variables, obsUnitId, create);
		
		if(useShares) {
			query.addSelect( V.PLOT_SHARE.div(100).sum().as( PLOT_DISTRIBUTION_COLUMN_NAME ) );
		} else {
			query.addSelect( V.PLOT_SECTION_ID.count().as( PLOT_DISTRIBUTION_COLUMN_NAME ) );
			query.addConditions( V.PRIMARY_SECTION.eq(true) );
		}
		
		return stream( query.fetch() );
	}

	private SelectQuery getPlotCategoryDistributionQuery(Collection<VariableMetadata> variables, int obsUnitId, Factory create) {
		SelectQuery query = create.selectQuery();
		
		query.addSelect( V.STRATUM_ID );
		query.addSelect( PSA.AOI_ID );
		
		query.addFrom(V);
		
		//TODO change in future
		query.addJoin( PSA, PSA.PLOT_SECTION_ID.eq( V.PLOT_SECTION_ID) );
		
		query.addConditions( V.PLOT_OBS_UNIT_ID.eq(obsUnitId) );
		query.addConditions( V.VISIT_TYPE.eq("P") );
		
		query.addGroupBy( V.STRATUM_ID );
		query.addGroupBy( PSA.AOI_ID );
		
		int varIndex = 0;
		for ( VariableMetadata variable : variables ) {
			if ( variable.isCategorical() && variable.isForAnalysis() ) {
				String varName = variable.getVariableName();
				PlotCategoricalValueView plotCatValueView = PLOT_CATEGORICAL_VALUE_VIEW.as( "c_"+ (varIndex++) );
				
				query.addSelect( plotCatValueView.CATEGORY_ID.as(varName) );
				
				query.addJoin(
						plotCatValueView, 
						JoinType.LEFT_OUTER_JOIN, 
						V.PLOT_SECTION_ID.eq(plotCatValueView.PLOT_SECTION_ID).and(plotCatValueView.VARIABLE_NAME.eq(varName))
						);
				
				query.addGroupBy( plotCatValueView.CATEGORY_ID );
			}
		}
		return query;
	}
	
}
