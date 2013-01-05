/**
 * This class is generated by jOOQ
 */
package org.openforis.calc.persistence.jooq.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.5.0"},
                            comments = "This class is generated by jOOQ")
public class OperationParameterRecord extends org.jooq.impl.UpdatableRecordImpl<org.openforis.calc.persistence.jooq.tables.records.OperationParameterRecord> {

	private static final long serialVersionUID = 1157877276;

	/**
	 * The table column <code>calc.operation_parameter.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.openforis.calc.persistence.jooq.tables.OperationParameterTable.OPERATION_PARAMETER.ID, value);
	}

	/**
	 * The table column <code>calc.operation_parameter.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.openforis.calc.persistence.jooq.tables.OperationParameterTable.OPERATION_PARAMETER.ID);
	}

	/**
	 * The table column <code>calc.operation_parameter.process_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT operation_parameter__fk_operation_parameter_process
	 * FOREIGN KEY (process_id)
	 * REFERENCES calc.process (id)
	 * </pre></code>
	 */
	public void setProcessId(java.lang.Integer value) {
		setValue(org.openforis.calc.persistence.jooq.tables.OperationParameterTable.OPERATION_PARAMETER.PROCESS_ID, value);
	}

	/**
	 * The table column <code>calc.operation_parameter.process_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT operation_parameter__fk_operation_parameter_process
	 * FOREIGN KEY (process_id)
	 * REFERENCES calc.process (id)
	 * </pre></code>
	 */
	public java.lang.Integer getProcessId() {
		return getValue(org.openforis.calc.persistence.jooq.tables.OperationParameterTable.OPERATION_PARAMETER.PROCESS_ID);
	}

	/**
	 * Link this record to a given {@link org.openforis.calc.persistence.jooq.tables.records.ProcessRecord 
	 * ProcessRecord}
	 */
	public void setProcessId(org.openforis.calc.persistence.jooq.tables.records.ProcessRecord value) {
		if (value == null) {
			setValue(org.openforis.calc.persistence.jooq.tables.OperationParameterTable.OPERATION_PARAMETER.PROCESS_ID, null);
		}
		else {
			setValue(org.openforis.calc.persistence.jooq.tables.OperationParameterTable.OPERATION_PARAMETER.PROCESS_ID, value.getValue(org.openforis.calc.persistence.jooq.tables.ProcessTable.PROCESS.ID));
		}
	}

	/**
	 * The table column <code>calc.operation_parameter.process_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT operation_parameter__fk_operation_parameter_process
	 * FOREIGN KEY (process_id)
	 * REFERENCES calc.process (id)
	 * </pre></code>
	 */
	public org.openforis.calc.persistence.jooq.tables.records.ProcessRecord fetchProcessTable() {
		return create()
			.selectFrom(org.openforis.calc.persistence.jooq.tables.ProcessTable.PROCESS)
			.where(org.openforis.calc.persistence.jooq.tables.ProcessTable.PROCESS.ID.equal(getValue(org.openforis.calc.persistence.jooq.tables.OperationParameterTable.OPERATION_PARAMETER.PROCESS_ID)))
			.fetchOne();
	}

	/**
	 * The table column <code>calc.operation_parameter.name</code>
	 */
	public void setName(java.lang.String value) {
		setValue(org.openforis.calc.persistence.jooq.tables.OperationParameterTable.OPERATION_PARAMETER.NAME, value);
	}

	/**
	 * The table column <code>calc.operation_parameter.name</code>
	 */
	public java.lang.String getName() {
		return getValue(org.openforis.calc.persistence.jooq.tables.OperationParameterTable.OPERATION_PARAMETER.NAME);
	}

	/**
	 * The table column <code>calc.operation_parameter.value</code>
	 */
	public void setValue(java.lang.String value) {
		setValue(org.openforis.calc.persistence.jooq.tables.OperationParameterTable.OPERATION_PARAMETER.VALUE, value);
	}

	/**
	 * The table column <code>calc.operation_parameter.value</code>
	 */
	public java.lang.String getValue() {
		return getValue(org.openforis.calc.persistence.jooq.tables.OperationParameterTable.OPERATION_PARAMETER.VALUE);
	}

	/**
	 * Create a detached OperationParameterRecord
	 */
	public OperationParameterRecord() {
		super(org.openforis.calc.persistence.jooq.tables.OperationParameterTable.OPERATION_PARAMETER);
	}
}
