/**
 * This class is generated by jOOQ
 */
package org.openforis.calc.persistence.jooq.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.5.0"},
                            comments = "This class is generated by jOOQ")
public class ProcessingChainRecord extends org.jooq.impl.UpdatableRecordImpl<org.openforis.calc.persistence.jooq.tables.records.ProcessingChainRecord> {

	private static final long serialVersionUID = 1997233973;

	/**
	 * The table column <code>calc.processing_chain.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.openforis.calc.persistence.jooq.tables.ProcessingChainTable.PROCESSING_CHAIN.ID, value);
	}

	/**
	 * The table column <code>calc.processing_chain.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.openforis.calc.persistence.jooq.tables.ProcessingChainTable.PROCESSING_CHAIN.ID);
	}

	/**
	 * The table column <code>calc.processing_chain.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.util.List<org.openforis.calc.persistence.jooq.tables.records.ProcessRecord> fetchProcessTableList() {
		return create()
			.selectFrom(org.openforis.calc.persistence.jooq.tables.ProcessTable.PROCESS)
			.where(org.openforis.calc.persistence.jooq.tables.ProcessTable.PROCESS.CHAIN_ID.equal(getValue(org.openforis.calc.persistence.jooq.tables.ProcessingChainTable.PROCESSING_CHAIN.ID)))
			.fetch();
	}

	/**
	 * The table column <code>calc.processing_chain.survey_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT processing_chain__fk_processing_chain_survey
	 * FOREIGN KEY (survey_id)
	 * REFERENCES calc.survey (id)
	 * </pre></code>
	 */
	public void setSurveyId(java.lang.Integer value) {
		setValue(org.openforis.calc.persistence.jooq.tables.ProcessingChainTable.PROCESSING_CHAIN.SURVEY_ID, value);
	}

	/**
	 * The table column <code>calc.processing_chain.survey_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT processing_chain__fk_processing_chain_survey
	 * FOREIGN KEY (survey_id)
	 * REFERENCES calc.survey (id)
	 * </pre></code>
	 */
	public java.lang.Integer getSurveyId() {
		return getValue(org.openforis.calc.persistence.jooq.tables.ProcessingChainTable.PROCESSING_CHAIN.SURVEY_ID);
	}

	/**
	 * Link this record to a given {@link org.openforis.calc.persistence.jooq.tables.records.SurveyRecord 
	 * SurveyRecord}
	 */
	public void setSurveyId(org.openforis.calc.persistence.jooq.tables.records.SurveyRecord value) {
		if (value == null) {
			setValue(org.openforis.calc.persistence.jooq.tables.ProcessingChainTable.PROCESSING_CHAIN.SURVEY_ID, null);
		}
		else {
			setValue(org.openforis.calc.persistence.jooq.tables.ProcessingChainTable.PROCESSING_CHAIN.SURVEY_ID, value.getValue(org.openforis.calc.persistence.jooq.tables.SurveyTable.SURVEY.ID));
		}
	}

	/**
	 * The table column <code>calc.processing_chain.survey_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT processing_chain__fk_processing_chain_survey
	 * FOREIGN KEY (survey_id)
	 * REFERENCES calc.survey (id)
	 * </pre></code>
	 */
	public org.openforis.calc.persistence.jooq.tables.records.SurveyRecord fetchSurveyTable() {
		return create()
			.selectFrom(org.openforis.calc.persistence.jooq.tables.SurveyTable.SURVEY)
			.where(org.openforis.calc.persistence.jooq.tables.SurveyTable.SURVEY.ID.equal(getValue(org.openforis.calc.persistence.jooq.tables.ProcessingChainTable.PROCESSING_CHAIN.SURVEY_ID)))
			.fetchOne();
	}

	/**
	 * The table column <code>calc.processing_chain.name</code>
	 */
	public void setName(java.lang.String value) {
		setValue(org.openforis.calc.persistence.jooq.tables.ProcessingChainTable.PROCESSING_CHAIN.NAME, value);
	}

	/**
	 * The table column <code>calc.processing_chain.name</code>
	 */
	public java.lang.String getName() {
		return getValue(org.openforis.calc.persistence.jooq.tables.ProcessingChainTable.PROCESSING_CHAIN.NAME);
	}

	/**
	 * The table column <code>calc.processing_chain.description</code>
	 */
	public void setDescription(java.lang.String value) {
		setValue(org.openforis.calc.persistence.jooq.tables.ProcessingChainTable.PROCESSING_CHAIN.DESCRIPTION, value);
	}

	/**
	 * The table column <code>calc.processing_chain.description</code>
	 */
	public java.lang.String getDescription() {
		return getValue(org.openforis.calc.persistence.jooq.tables.ProcessingChainTable.PROCESSING_CHAIN.DESCRIPTION);
	}

	/**
	 * Create a detached ProcessingChainRecord
	 */
	public ProcessingChainRecord() {
		super(org.openforis.calc.persistence.jooq.tables.ProcessingChainTable.PROCESSING_CHAIN);
	}
}
