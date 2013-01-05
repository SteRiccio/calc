/**
 * This class is generated by jOOQ
 */
package org.openforis.calc.persistence.jooq.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.5.0"},
                            comments = "This class is generated by jOOQ")
public class TaxonomicChecklistRecord extends org.jooq.impl.UpdatableRecordImpl<org.openforis.calc.persistence.jooq.tables.records.TaxonomicChecklistRecord> {

	private static final long serialVersionUID = 1032884936;

	/**
	 * The table column <code>calc.taxonomic_checklist.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.openforis.calc.persistence.jooq.tables.TaxonomicChecklistTable.TAXONOMIC_CHECKLIST.ID, value);
	}

	/**
	 * The table column <code>calc.taxonomic_checklist.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.openforis.calc.persistence.jooq.tables.TaxonomicChecklistTable.TAXONOMIC_CHECKLIST.ID);
	}

	/**
	 * The table column <code>calc.taxonomic_checklist.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.util.List<org.openforis.calc.persistence.jooq.tables.records.TaxonRecord> fetchTaxonTableList() {
		return create()
			.selectFrom(org.openforis.calc.persistence.jooq.tables.TaxonTable.TAXON)
			.where(org.openforis.calc.persistence.jooq.tables.TaxonTable.TAXON.CHECKLIST_ID.equal(getValue(org.openforis.calc.persistence.jooq.tables.TaxonomicChecklistTable.TAXONOMIC_CHECKLIST.ID)))
			.fetch();
	}

	/**
	 * The table column <code>calc.taxonomic_checklist.survey_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT taxonomic_checklist__fk_taxonomic_checklist_survey
	 * FOREIGN KEY (survey_id)
	 * REFERENCES calc.survey (id)
	 * </pre></code>
	 */
	public void setSurveyId(java.lang.Integer value) {
		setValue(org.openforis.calc.persistence.jooq.tables.TaxonomicChecklistTable.TAXONOMIC_CHECKLIST.SURVEY_ID, value);
	}

	/**
	 * The table column <code>calc.taxonomic_checklist.survey_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT taxonomic_checklist__fk_taxonomic_checklist_survey
	 * FOREIGN KEY (survey_id)
	 * REFERENCES calc.survey (id)
	 * </pre></code>
	 */
	public java.lang.Integer getSurveyId() {
		return getValue(org.openforis.calc.persistence.jooq.tables.TaxonomicChecklistTable.TAXONOMIC_CHECKLIST.SURVEY_ID);
	}

	/**
	 * Link this record to a given {@link org.openforis.calc.persistence.jooq.tables.records.SurveyRecord 
	 * SurveyRecord}
	 */
	public void setSurveyId(org.openforis.calc.persistence.jooq.tables.records.SurveyRecord value) {
		if (value == null) {
			setValue(org.openforis.calc.persistence.jooq.tables.TaxonomicChecklistTable.TAXONOMIC_CHECKLIST.SURVEY_ID, null);
		}
		else {
			setValue(org.openforis.calc.persistence.jooq.tables.TaxonomicChecklistTable.TAXONOMIC_CHECKLIST.SURVEY_ID, value.getValue(org.openforis.calc.persistence.jooq.tables.SurveyTable.SURVEY.ID));
		}
	}

	/**
	 * The table column <code>calc.taxonomic_checklist.survey_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT taxonomic_checklist__fk_taxonomic_checklist_survey
	 * FOREIGN KEY (survey_id)
	 * REFERENCES calc.survey (id)
	 * </pre></code>
	 */
	public org.openforis.calc.persistence.jooq.tables.records.SurveyRecord fetchSurveyTable() {
		return create()
			.selectFrom(org.openforis.calc.persistence.jooq.tables.SurveyTable.SURVEY)
			.where(org.openforis.calc.persistence.jooq.tables.SurveyTable.SURVEY.ID.equal(getValue(org.openforis.calc.persistence.jooq.tables.TaxonomicChecklistTable.TAXONOMIC_CHECKLIST.SURVEY_ID)))
			.fetchOne();
	}

	/**
	 * The table column <code>calc.taxonomic_checklist.name</code>
	 */
	public void setName(java.lang.String value) {
		setValue(org.openforis.calc.persistence.jooq.tables.TaxonomicChecklistTable.TAXONOMIC_CHECKLIST.NAME, value);
	}

	/**
	 * The table column <code>calc.taxonomic_checklist.name</code>
	 */
	public java.lang.String getName() {
		return getValue(org.openforis.calc.persistence.jooq.tables.TaxonomicChecklistTable.TAXONOMIC_CHECKLIST.NAME);
	}

	/**
	 * Create a detached TaxonomicChecklistRecord
	 */
	public TaxonomicChecklistRecord() {
		super(org.openforis.calc.persistence.jooq.tables.TaxonomicChecklistTable.TAXONOMIC_CHECKLIST);
	}
}