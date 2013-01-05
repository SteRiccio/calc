/**
 * This class is generated by jOOQ
 */
package org.openforis.calc.persistence.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.5.0"},
                            comments = "This class is generated by jOOQ")
public class PlotSurveyTable extends org.jooq.impl.UpdatableTableImpl<org.openforis.calc.persistence.jooq.tables.records.PlotSurveyRecord> {

	private static final long serialVersionUID = 290632951;

	/**
	 * The singleton instance of calc.plot_survey
	 */
	public static final org.openforis.calc.persistence.jooq.tables.PlotSurveyTable PLOT_SURVEY = new org.openforis.calc.persistence.jooq.tables.PlotSurveyTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.openforis.calc.persistence.jooq.tables.records.PlotSurveyRecord> getRecordType() {
		return org.openforis.calc.persistence.jooq.tables.records.PlotSurveyRecord.class;
	}

	/**
	 * The table column <code>calc.plot_survey.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.PlotSurveyRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.plot_survey.survey_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT plot_survey__fk_plot_survey_survey
	 * FOREIGN KEY (survey_id)
	 * REFERENCES calc.survey (id)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.PlotSurveyRecord, java.lang.Integer> SURVEY_ID = createField("survey_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.plot_survey.plot_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT plot_survey__fk_plot_survey_plot
	 * FOREIGN KEY (plot_id)
	 * REFERENCES calc.plot (id)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.PlotSurveyRecord, java.lang.Integer> PLOT_ID = createField("plot_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.plot_survey.obs_unit_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT plot_survey__fk_plot_survey_obs_unit
	 * FOREIGN KEY (obs_unit_id)
	 * REFERENCES calc.observation_unit (id)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.PlotSurveyRecord, java.lang.Integer> OBS_UNIT_ID = createField("obs_unit_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.plot_survey.section_no</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.PlotSurveyRecord, java.lang.Integer> SECTION_NO = createField("section_no", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.plot_survey.survey_date</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.PlotSurveyRecord, java.sql.Date> SURVEY_DATE = createField("survey_date", org.jooq.impl.SQLDataType.DATE, this);

	/**
	 * The table column <code>calc.plot_survey.gps_reading</code>
	 * <p>
	 * The SQL type of this item (USER-DEFINED, geometry) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.PlotSurveyRecord, java.lang.Object> GPS_READING = createField("gps_reading", org.jooq.util.postgres.PostgresDataType.getDefaultDataType("USER-DEFINED"), this);

	/**
	 * The table column <code>calc.plot_survey.direction</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.PlotSurveyRecord, java.lang.Double> DIRECTION = createField("direction", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The table column <code>calc.plot_survey.distance</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.PlotSurveyRecord, java.lang.Double> DISTANCE = createField("distance", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The table column <code>calc.plot_survey.location</code>
	 * <p>
	 * The SQL type of this item (USER-DEFINED, geometry) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.PlotSurveyRecord, java.lang.Object> LOCATION = createField("location", org.jooq.util.postgres.PostgresDataType.getDefaultDataType("USER-DEFINED"), this);

	/**
	 * The table column <code>calc.plot_survey.accessible</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.PlotSurveyRecord, java.lang.Boolean> ACCESSIBLE = createField("accessible", org.jooq.impl.SQLDataType.BOOLEAN, this);

	/**
	 * The table column <code>calc.plot_survey.parent_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT plot_survey__fk_parent_plot_survey
	 * FOREIGN KEY (parent_id)
	 * REFERENCES calc.plot_survey (id)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.PlotSurveyRecord, java.lang.Integer> PARENT_ID = createField("parent_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.plot_survey.survey_type</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.PlotSurveyRecord, java.lang.String> SURVEY_TYPE = createField("survey_type", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * The table column <code>calc.plot_survey.step</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.PlotSurveyRecord, java.lang.Integer> STEP = createField("step", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.plot_survey.source_id</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.PlotSurveyRecord, java.lang.Integer> SOURCE_ID = createField("source_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.plot_survey.shape</code>
	 * <p>
	 * The SQL type of this item (USER-DEFINED, geometry) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.PlotSurveyRecord, java.lang.Object> SHAPE = createField("shape", org.jooq.util.postgres.PostgresDataType.getDefaultDataType("USER-DEFINED"), this);

	/**
	 * The table column <code>calc.plot_survey.area</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.PlotSurveyRecord, java.lang.Integer> AREA = createField("area", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.plot_survey.percent_share</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.PlotSurveyRecord, java.lang.Double> PERCENT_SHARE = createField("percent_share", org.jooq.impl.SQLDataType.DOUBLE, this);

	public PlotSurveyTable() {
		super("plot_survey", org.openforis.calc.persistence.jooq.CalcTable.CALC);
	}

	public PlotSurveyTable(java.lang.String alias) {
		super(alias, org.openforis.calc.persistence.jooq.CalcTable.CALC, org.openforis.calc.persistence.jooq.tables.PlotSurveyTable.PLOT_SURVEY);
	}

	@Override
	public org.jooq.Identity<org.openforis.calc.persistence.jooq.tables.records.PlotSurveyRecord, java.lang.Integer> getIdentity() {
		return org.openforis.calc.persistence.jooq.Keys.IDENTITY_PLOT_SURVEY;
	}

	@Override
	public org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.PlotSurveyRecord> getMainKey() {
		return org.openforis.calc.persistence.jooq.Keys.PLOT_SURVEY_PKEY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.PlotSurveyRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.PlotSurveyRecord>>asList(org.openforis.calc.persistence.jooq.Keys.PLOT_SURVEY_PKEY, org.openforis.calc.persistence.jooq.Keys.UK_PLOT_SURVEY);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.PlotSurveyRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.PlotSurveyRecord, ?>>asList(org.openforis.calc.persistence.jooq.Keys.PLOT_SURVEY__FK_PLOT_SURVEY_SURVEY, org.openforis.calc.persistence.jooq.Keys.PLOT_SURVEY__FK_PLOT_SURVEY_PLOT, org.openforis.calc.persistence.jooq.Keys.PLOT_SURVEY__FK_PLOT_SURVEY_OBS_UNIT, org.openforis.calc.persistence.jooq.Keys.PLOT_SURVEY__FK_PARENT_PLOT_SURVEY);
	}

	@Override
	public org.openforis.calc.persistence.jooq.tables.PlotSurveyTable as(java.lang.String alias) {
		return new org.openforis.calc.persistence.jooq.tables.PlotSurveyTable(alias);
	}
}
