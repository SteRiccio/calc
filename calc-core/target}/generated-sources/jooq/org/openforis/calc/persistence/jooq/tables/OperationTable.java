/**
 * This class is generated by jOOQ
 */
package org.openforis.calc.persistence.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.5.0"},
                            comments = "This class is generated by jOOQ")
public class OperationTable extends org.jooq.impl.UpdatableTableImpl<org.openforis.calc.persistence.jooq.tables.records.OperationRecord> {

	private static final long serialVersionUID = 821318295;

	/**
	 * The singleton instance of calc.operation
	 */
	public static final org.openforis.calc.persistence.jooq.tables.OperationTable OPERATION = new org.openforis.calc.persistence.jooq.tables.OperationTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.openforis.calc.persistence.jooq.tables.records.OperationRecord> getRecordType() {
		return org.openforis.calc.persistence.jooq.tables.records.OperationRecord.class;
	}

	/**
	 * The table column <code>calc.operation.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.OperationRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.operation.name</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.OperationRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>calc.operation.description</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.OperationRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>calc.operation.class</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.OperationRecord, java.lang.String> CLASS = createField("class", org.jooq.impl.SQLDataType.VARCHAR, this);

	public OperationTable() {
		super("operation", org.openforis.calc.persistence.jooq.CalcTable.CALC);
	}

	public OperationTable(java.lang.String alias) {
		super(alias, org.openforis.calc.persistence.jooq.CalcTable.CALC, org.openforis.calc.persistence.jooq.tables.OperationTable.OPERATION);
	}

	@Override
	public org.jooq.Identity<org.openforis.calc.persistence.jooq.tables.records.OperationRecord, java.lang.Integer> getIdentity() {
		return org.openforis.calc.persistence.jooq.Keys.IDENTITY_OPERATION;
	}

	@Override
	public org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.OperationRecord> getMainKey() {
		return org.openforis.calc.persistence.jooq.Keys.OPERATION_PKEY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.OperationRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.OperationRecord>>asList(org.openforis.calc.persistence.jooq.Keys.OPERATION_PKEY);
	}

	@Override
	public org.openforis.calc.persistence.jooq.tables.OperationTable as(java.lang.String alias) {
		return new org.openforis.calc.persistence.jooq.tables.OperationTable(alias);
	}
}
