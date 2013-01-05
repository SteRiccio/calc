/**
 * This class is generated by jOOQ
 */
package org.openforis.calc.persistence.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.5.0"},
                            comments = "This class is generated by jOOQ")
public class CategoryTable extends org.jooq.impl.UpdatableTableImpl<org.openforis.calc.persistence.jooq.tables.records.CategoryRecord> {

	private static final long serialVersionUID = 1153679741;

	/**
	 * The singleton instance of calc.category
	 */
	public static final org.openforis.calc.persistence.jooq.tables.CategoryTable CATEGORY = new org.openforis.calc.persistence.jooq.tables.CategoryTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.openforis.calc.persistence.jooq.tables.records.CategoryRecord> getRecordType() {
		return org.openforis.calc.persistence.jooq.tables.records.CategoryRecord.class;
	}

	/**
	 * The table column <code>calc.category.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.CategoryRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.category.variable_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT category__fk_category_variable
	 * FOREIGN KEY (variable_id)
	 * REFERENCES calc.variable (id)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.CategoryRecord, java.lang.Integer> VARIABLE_ID = createField("variable_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.category.code</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.CategoryRecord, java.lang.String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>calc.category.default_label</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.CategoryRecord, java.lang.String> DEFAULT_LABEL = createField("default_label", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>calc.category.order</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.CategoryRecord, java.lang.Integer> ORDER = createField("order", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.category.source_id</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.CategoryRecord, java.lang.Integer> SOURCE_ID = createField("source_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>calc.category.banding_interval</code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.CategoryRecord, java.lang.String> BANDING_INTERVAL = createField("banding_interval", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>calc.category.banding_source_variable_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT category__fk_category_banding_source_variable
	 * FOREIGN KEY (banding_source_variable_id)
	 * REFERENCES calc.variable (id)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.openforis.calc.persistence.jooq.tables.records.CategoryRecord, java.lang.Integer> BANDING_SOURCE_VARIABLE_ID = createField("banding_source_variable_id", org.jooq.impl.SQLDataType.INTEGER, this);

	public CategoryTable() {
		super("category", org.openforis.calc.persistence.jooq.CalcTable.CALC);
	}

	public CategoryTable(java.lang.String alias) {
		super(alias, org.openforis.calc.persistence.jooq.CalcTable.CALC, org.openforis.calc.persistence.jooq.tables.CategoryTable.CATEGORY);
	}

	@Override
	public org.jooq.Identity<org.openforis.calc.persistence.jooq.tables.records.CategoryRecord, java.lang.Integer> getIdentity() {
		return org.openforis.calc.persistence.jooq.Keys.IDENTITY_CATEGORY;
	}

	@Override
	public org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.CategoryRecord> getMainKey() {
		return org.openforis.calc.persistence.jooq.Keys.CATEGORY_PKEY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.CategoryRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.openforis.calc.persistence.jooq.tables.records.CategoryRecord>>asList(org.openforis.calc.persistence.jooq.Keys.CATEGORY_PKEY, org.openforis.calc.persistence.jooq.Keys.UK_CATEGORY_CODE);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.CategoryRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.openforis.calc.persistence.jooq.tables.records.CategoryRecord, ?>>asList(org.openforis.calc.persistence.jooq.Keys.CATEGORY__FK_CATEGORY_VARIABLE, org.openforis.calc.persistence.jooq.Keys.CATEGORY__FK_CATEGORY_BANDING_SOURCE_VARIABLE);
	}

	@Override
	public org.openforis.calc.persistence.jooq.tables.CategoryTable as(java.lang.String alias) {
		return new org.openforis.calc.persistence.jooq.tables.CategoryTable(alias);
	}
}