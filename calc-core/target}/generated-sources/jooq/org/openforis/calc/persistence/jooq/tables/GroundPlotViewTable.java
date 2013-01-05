/**
 * This class is generated by jOOQ
 */
package org.openforis.calc.persistence.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.5.0"},
                            comments = "This class is generated by jOOQ")
public class GroundPlotViewTable extends org.jooq.impl.TableImpl<org.openforis.calc.persistence.jooq.tables.records.GroundPlotViewRecord> {

	private static final long serialVersionUID = -1816837663;

	/**
	 * The singleton instance of calc.ground_plot_view
	 */
	public static final org.openforis.calc.persistence.jooq.tables.GroundPlotViewTable GROUND_PLOT_VIEW = new org.openforis.calc.persistence.jooq.tables.GroundPlotViewTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.openforis.calc.persistence.jooq.tables.records.GroundPlotViewRecord> getRecordType() {
		return org.openforis.calc.persistence.jooq.tables.records.GroundPlotViewRecord.class;
	}

	/**
	 * The table column <code>calc.ground_plot_view.survey_id</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.GroundPlotViewRecord, java.lang.Integer> SURVEY_ID = createField("survey_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.ground_plot_view.stratum_id</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.GroundPlotViewRecord, java.lang.Integer> STRATUM_ID = createField("stratum_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.ground_plot_view.stratum_no</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.GroundPlotViewRecord, java.lang.Integer> STRATUM_NO = createField("stratum_no", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.ground_plot_view.stratum_code</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.GroundPlotViewRecord, java.lang.String> STRATUM_CODE = createField("stratum_code", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>calc.ground_plot_view.cluster_id</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.GroundPlotViewRecord, java.lang.Integer> CLUSTER_ID = createField("cluster_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.ground_plot_view.cluster_no</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.GroundPlotViewRecord, java.lang.Integer> CLUSTER_NO = createField("cluster_no", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.ground_plot_view.cluster_code</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.GroundPlotViewRecord, java.lang.String> CLUSTER_CODE = createField("cluster_code", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>calc.ground_plot_view.cluster_x</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.GroundPlotViewRecord, java.lang.Integer> CLUSTER_X = createField("cluster_x", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.ground_plot_view.cluster_y</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.GroundPlotViewRecord, java.lang.Integer> CLUSTER_Y = createField("cluster_y", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.ground_plot_view.plot_id</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.GroundPlotViewRecord, java.lang.Integer> PLOT_ID = createField("plot_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.ground_plot_view.plot_no</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.GroundPlotViewRecord, java.lang.Integer> PLOT_NO = createField("plot_no", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.ground_plot_view.plot_code</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.GroundPlotViewRecord, java.lang.String> PLOT_CODE = createField("plot_code", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>calc.ground_plot_view.location</code>
	 * <p>
	 * The SQL type of this item (USER-DEFINED, geometry) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.GroundPlotViewRecord, java.lang.Object> LOCATION = createField("location", org.jooq.util.postgres.PostgresDataType.getDefaultDataType("USER-DEFINED"), this);

	/**
	 * The table column <code>calc.ground_plot_view.shape</code>
	 * <p>
	 * The SQL type of this item (USER-DEFINED, geometry) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.GroundPlotViewRecord, java.lang.Object> SHAPE = createField("shape", org.jooq.util.postgres.PostgresDataType.getDefaultDataType("USER-DEFINED"), this);

	/**
	 * The table column <code>calc.ground_plot_view.phase</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.GroundPlotViewRecord, java.lang.Integer> PHASE = createField("phase", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.ground_plot_view.ground_plot</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.GroundPlotViewRecord, java.lang.Boolean> GROUND_PLOT = createField("ground_plot", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The table column <code>calc.ground_plot_view.permanent_plot</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.GroundPlotViewRecord, java.lang.Boolean> PERMANENT_PLOT = createField("permanent_plot", org.jooq.impl.SQLDataType.BOOLEAN, this);

	public GroundPlotViewTable() {
		super("ground_plot_view", org.openforis.calc.persistence.jooq.CalcTable.CALC);
	}

	public GroundPlotViewTable(java.lang.String alias) {
		super(alias, org.openforis.calc.persistence.jooq.CalcTable.CALC, org.openforis.calc.persistence.jooq.tables.GroundPlotViewTable.GROUND_PLOT_VIEW);
	}

	@Override
	public org.openforis.calc.persistence.jooq.tables.GroundPlotViewTable as(java.lang.String alias) {
		return new org.openforis.calc.persistence.jooq.tables.GroundPlotViewTable(alias);
	}
}
