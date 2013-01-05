/**
 * This class is generated by jOOQ
 */
package org.openforis.calc.persistence.jooq.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.5.0"},
                            comments = "This class is generated by jOOQ")
public class SpecimenRecord extends org.jooq.impl.UpdatableRecordImpl<org.openforis.calc.persistence.jooq.tables.records.SpecimenRecord> {

	private static final long serialVersionUID = 572093519;

	/**
	 * The table column <code>calc.specimen.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.openforis.calc.persistence.jooq.tables.SpecimenTable.SPECIMEN.ID, value);
	}

	/**
	 * The table column <code>calc.specimen.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.openforis.calc.persistence.jooq.tables.SpecimenTable.SPECIMEN.ID);
	}

	/**
	 * The table column <code>calc.specimen.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.util.List<org.openforis.calc.persistence.jooq.tables.records.SpecimenRecord> fetchSpecimenTableList() {
		return create()
			.selectFrom(org.openforis.calc.persistence.jooq.tables.SpecimenTable.SPECIMEN)
			.where(org.openforis.calc.persistence.jooq.tables.SpecimenTable.SPECIMEN.PARENT_ID.equal(getValue(org.openforis.calc.persistence.jooq.tables.SpecimenTable.SPECIMEN.ID)))
			.fetch();
	}

	/**
	 * The table column <code>calc.specimen.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.util.List<org.openforis.calc.persistence.jooq.tables.records.SpecimenCategoryRecord> fetchSpecimenCategoryTableList() {
		return create()
			.selectFrom(org.openforis.calc.persistence.jooq.tables.SpecimenCategoryTable.SPECIMEN_CATEGORY)
			.where(org.openforis.calc.persistence.jooq.tables.SpecimenCategoryTable.SPECIMEN_CATEGORY.SPECIMEN_ID.equal(getValue(org.openforis.calc.persistence.jooq.tables.SpecimenTable.SPECIMEN.ID)))
			.fetch();
	}

	/**
	 * The table column <code>calc.specimen.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.util.List<org.openforis.calc.persistence.jooq.tables.records.SpecimenMeasurementRecord> fetchSpecimenMeasurementTableList() {
		return create()
			.selectFrom(org.openforis.calc.persistence.jooq.tables.SpecimenMeasurementTable.SPECIMEN_MEASUREMENT)
			.where(org.openforis.calc.persistence.jooq.tables.SpecimenMeasurementTable.SPECIMEN_MEASUREMENT.SPECIMEN_ID.equal(getValue(org.openforis.calc.persistence.jooq.tables.SpecimenTable.SPECIMEN.ID)))
			.fetch();
	}

	/**
	 * The table column <code>calc.specimen.plot_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT specimen__fk_specimen_plot
	 * FOREIGN KEY (plot_id)
	 * REFERENCES calc.plot_survey (id)
	 * </pre></code>
	 */
	public void setPlotId(java.lang.Integer value) {
		setValue(org.openforis.calc.persistence.jooq.tables.SpecimenTable.SPECIMEN.PLOT_ID, value);
	}

	/**
	 * The table column <code>calc.specimen.plot_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT specimen__fk_specimen_plot
	 * FOREIGN KEY (plot_id)
	 * REFERENCES calc.plot_survey (id)
	 * </pre></code>
	 */
	public java.lang.Integer getPlotId() {
		return getValue(org.openforis.calc.persistence.jooq.tables.SpecimenTable.SPECIMEN.PLOT_ID);
	}

	/**
	 * Link this record to a given {@link org.openforis.calc.persistence.jooq.tables.records.PlotSurveyRecord 
	 * PlotSurveyRecord}
	 */
	public void setPlotId(org.openforis.calc.persistence.jooq.tables.records.PlotSurveyRecord value) {
		if (value == null) {
			setValue(org.openforis.calc.persistence.jooq.tables.SpecimenTable.SPECIMEN.PLOT_ID, null);
		}
		else {
			setValue(org.openforis.calc.persistence.jooq.tables.SpecimenTable.SPECIMEN.PLOT_ID, value.getValue(org.openforis.calc.persistence.jooq.tables.PlotSurveyTable.PLOT_SURVEY.ID));
		}
	}

	/**
	 * The table column <code>calc.specimen.plot_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT specimen__fk_specimen_plot
	 * FOREIGN KEY (plot_id)
	 * REFERENCES calc.plot_survey (id)
	 * </pre></code>
	 */
	public org.openforis.calc.persistence.jooq.tables.records.PlotSurveyRecord fetchPlotSurveyTable() {
		return create()
			.selectFrom(org.openforis.calc.persistence.jooq.tables.PlotSurveyTable.PLOT_SURVEY)
			.where(org.openforis.calc.persistence.jooq.tables.PlotSurveyTable.PLOT_SURVEY.ID.equal(getValue(org.openforis.calc.persistence.jooq.tables.SpecimenTable.SPECIMEN.PLOT_ID)))
			.fetchOne();
	}

	/**
	 * The table column <code>calc.specimen.obs_unit_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT specimen__fk_specimen_obs_unit
	 * FOREIGN KEY (obs_unit_id)
	 * REFERENCES calc.observation_unit (id)
	 * </pre></code>
	 */
	public void setObsUnitId(java.lang.Integer value) {
		setValue(org.openforis.calc.persistence.jooq.tables.SpecimenTable.SPECIMEN.OBS_UNIT_ID, value);
	}

	/**
	 * The table column <code>calc.specimen.obs_unit_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT specimen__fk_specimen_obs_unit
	 * FOREIGN KEY (obs_unit_id)
	 * REFERENCES calc.observation_unit (id)
	 * </pre></code>
	 */
	public java.lang.Integer getObsUnitId() {
		return getValue(org.openforis.calc.persistence.jooq.tables.SpecimenTable.SPECIMEN.OBS_UNIT_ID);
	}

	/**
	 * Link this record to a given {@link org.openforis.calc.persistence.jooq.tables.records.ObservationUnitRecord 
	 * ObservationUnitRecord}
	 */
	public void setObsUnitId(org.openforis.calc.persistence.jooq.tables.records.ObservationUnitRecord value) {
		if (value == null) {
			setValue(org.openforis.calc.persistence.jooq.tables.SpecimenTable.SPECIMEN.OBS_UNIT_ID, null);
		}
		else {
			setValue(org.openforis.calc.persistence.jooq.tables.SpecimenTable.SPECIMEN.OBS_UNIT_ID, value.getValue(org.openforis.calc.persistence.jooq.tables.ObservationUnitTable.OBSERVATION_UNIT.ID));
		}
	}

	/**
	 * The table column <code>calc.specimen.obs_unit_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT specimen__fk_specimen_obs_unit
	 * FOREIGN KEY (obs_unit_id)
	 * REFERENCES calc.observation_unit (id)
	 * </pre></code>
	 */
	public org.openforis.calc.persistence.jooq.tables.records.ObservationUnitRecord fetchObservationUnitTable() {
		return create()
			.selectFrom(org.openforis.calc.persistence.jooq.tables.ObservationUnitTable.OBSERVATION_UNIT)
			.where(org.openforis.calc.persistence.jooq.tables.ObservationUnitTable.OBSERVATION_UNIT.ID.equal(getValue(org.openforis.calc.persistence.jooq.tables.SpecimenTable.SPECIMEN.OBS_UNIT_ID)))
			.fetchOne();
	}

	/**
	 * The table column <code>calc.specimen.taxon_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT specimen__fk_specimen_taxon
	 * FOREIGN KEY (taxon_id)
	 * REFERENCES calc.taxon (id)
	 * </pre></code>
	 */
	public void setTaxonId(java.lang.Integer value) {
		setValue(org.openforis.calc.persistence.jooq.tables.SpecimenTable.SPECIMEN.TAXON_ID, value);
	}

	/**
	 * The table column <code>calc.specimen.taxon_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT specimen__fk_specimen_taxon
	 * FOREIGN KEY (taxon_id)
	 * REFERENCES calc.taxon (id)
	 * </pre></code>
	 */
	public java.lang.Integer getTaxonId() {
		return getValue(org.openforis.calc.persistence.jooq.tables.SpecimenTable.SPECIMEN.TAXON_ID);
	}

	/**
	 * Link this record to a given {@link org.openforis.calc.persistence.jooq.tables.records.TaxonRecord 
	 * TaxonRecord}
	 */
	public void setTaxonId(org.openforis.calc.persistence.jooq.tables.records.TaxonRecord value) {
		if (value == null) {
			setValue(org.openforis.calc.persistence.jooq.tables.SpecimenTable.SPECIMEN.TAXON_ID, null);
		}
		else {
			setValue(org.openforis.calc.persistence.jooq.tables.SpecimenTable.SPECIMEN.TAXON_ID, value.getValue(org.openforis.calc.persistence.jooq.tables.TaxonTable.TAXON.ID));
		}
	}

	/**
	 * The table column <code>calc.specimen.taxon_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT specimen__fk_specimen_taxon
	 * FOREIGN KEY (taxon_id)
	 * REFERENCES calc.taxon (id)
	 * </pre></code>
	 */
	public org.openforis.calc.persistence.jooq.tables.records.TaxonRecord fetchTaxonTable() {
		return create()
			.selectFrom(org.openforis.calc.persistence.jooq.tables.TaxonTable.TAXON)
			.where(org.openforis.calc.persistence.jooq.tables.TaxonTable.TAXON.ID.equal(getValue(org.openforis.calc.persistence.jooq.tables.SpecimenTable.SPECIMEN.TAXON_ID)))
			.fetchOne();
	}

	/**
	 * The table column <code>calc.specimen.survey_date</code>
	 */
	public void setSurveyDate(java.sql.Date value) {
		setValue(org.openforis.calc.persistence.jooq.tables.SpecimenTable.SPECIMEN.SURVEY_DATE, value);
	}

	/**
	 * The table column <code>calc.specimen.survey_date</code>
	 */
	public java.sql.Date getSurveyDate() {
		return getValue(org.openforis.calc.persistence.jooq.tables.SpecimenTable.SPECIMEN.SURVEY_DATE);
	}

	/**
	 * The table column <code>calc.specimen.source_id</code>
	 */
	public void setSourceId(java.lang.Integer value) {
		setValue(org.openforis.calc.persistence.jooq.tables.SpecimenTable.SPECIMEN.SOURCE_ID, value);
	}

	/**
	 * The table column <code>calc.specimen.source_id</code>
	 */
	public java.lang.Integer getSourceId() {
		return getValue(org.openforis.calc.persistence.jooq.tables.SpecimenTable.SPECIMEN.SOURCE_ID);
	}

	/**
	 * The table column <code>calc.specimen.parent_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT specimen__fk_specimen_parent
	 * FOREIGN KEY (parent_id)
	 * REFERENCES calc.specimen (id)
	 * </pre></code>
	 */
	public void setParentId(java.lang.Integer value) {
		setValue(org.openforis.calc.persistence.jooq.tables.SpecimenTable.SPECIMEN.PARENT_ID, value);
	}

	/**
	 * The table column <code>calc.specimen.parent_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT specimen__fk_specimen_parent
	 * FOREIGN KEY (parent_id)
	 * REFERENCES calc.specimen (id)
	 * </pre></code>
	 */
	public java.lang.Integer getParentId() {
		return getValue(org.openforis.calc.persistence.jooq.tables.SpecimenTable.SPECIMEN.PARENT_ID);
	}

	/**
	 * Link this record to a given {@link org.openforis.calc.persistence.jooq.tables.records.SpecimenRecord 
	 * SpecimenRecord}
	 */
	public void setParentId(org.openforis.calc.persistence.jooq.tables.records.SpecimenRecord value) {
		if (value == null) {
			setValue(org.openforis.calc.persistence.jooq.tables.SpecimenTable.SPECIMEN.PARENT_ID, null);
		}
		else {
			setValue(org.openforis.calc.persistence.jooq.tables.SpecimenTable.SPECIMEN.PARENT_ID, value.getValue(org.openforis.calc.persistence.jooq.tables.SpecimenTable.SPECIMEN.ID));
		}
	}

	/**
	 * The table column <code>calc.specimen.parent_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT specimen__fk_specimen_parent
	 * FOREIGN KEY (parent_id)
	 * REFERENCES calc.specimen (id)
	 * </pre></code>
	 */
	public org.openforis.calc.persistence.jooq.tables.records.SpecimenRecord fetchSpecimenTable() {
		return create()
			.selectFrom(org.openforis.calc.persistence.jooq.tables.SpecimenTable.SPECIMEN)
			.where(org.openforis.calc.persistence.jooq.tables.SpecimenTable.SPECIMEN.ID.equal(getValue(org.openforis.calc.persistence.jooq.tables.SpecimenTable.SPECIMEN.PARENT_ID)))
			.fetchOne();
	}

	/**
	 * Create a detached SpecimenRecord
	 */
	public SpecimenRecord() {
		super(org.openforis.calc.persistence.jooq.tables.SpecimenTable.SPECIMEN);
	}
}
