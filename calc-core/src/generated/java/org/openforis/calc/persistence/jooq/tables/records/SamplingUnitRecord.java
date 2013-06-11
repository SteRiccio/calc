/**
 * This class is generated by jOOQ
 */
package org.openforis.calc.persistence.jooq.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class SamplingUnitRecord extends org.jooq.impl.UpdatableRecordImpl<org.openforis.calc.persistence.jooq.tables.records.SamplingUnitRecord> {

	private static final long serialVersionUID = 750167088;

	/**
	 * The table column <code>calc.sampling_unit.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.openforis.calc.persistence.jooq.tables.SamplingUnitTable.SAMPLING_UNIT.ID, value);
	}

	/**
	 * The table column <code>calc.sampling_unit.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.openforis.calc.persistence.jooq.tables.SamplingUnitTable.SAMPLING_UNIT.ID);
	}

	/**
	 * The table column <code>calc.sampling_unit.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.util.List<org.openforis.calc.persistence.jooq.tables.records.SamplingUnitAoiRecord> fetchSamplingUnitAoiTableList() {
		return create()
			.selectFrom(org.openforis.calc.persistence.jooq.tables.SamplingUnitAoiTable.SAMPLING_UNIT_AOI)
			.where(org.openforis.calc.persistence.jooq.tables.SamplingUnitAoiTable.SAMPLING_UNIT_AOI.SAMPLING_UNIT_ID.equal(getValue(org.openforis.calc.persistence.jooq.tables.SamplingUnitTable.SAMPLING_UNIT.ID)))
			.fetch();
	}

	/**
	 * The table column <code>calc.sampling_unit.entity_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT sampling_unit__sampling_unit_entity_fkey
	 * FOREIGN KEY (entity_id)
	 * REFERENCES calc.entity (id)
	 * </pre></code>
	 */
	public void setEntityId(java.lang.Integer value) {
		setValue(org.openforis.calc.persistence.jooq.tables.SamplingUnitTable.SAMPLING_UNIT.ENTITY_ID, value);
	}

	/**
	 * The table column <code>calc.sampling_unit.entity_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT sampling_unit__sampling_unit_entity_fkey
	 * FOREIGN KEY (entity_id)
	 * REFERENCES calc.entity (id)
	 * </pre></code>
	 */
	public java.lang.Integer getEntityId() {
		return getValue(org.openforis.calc.persistence.jooq.tables.SamplingUnitTable.SAMPLING_UNIT.ENTITY_ID);
	}

	/**
	 * Link this record to a given {@link org.openforis.calc.persistence.jooq.tables.records.EntityRecord 
	 * EntityRecord}
	 */
	public void setEntityId(org.openforis.calc.persistence.jooq.tables.records.EntityRecord value) {
		if (value == null) {
			setValue(org.openforis.calc.persistence.jooq.tables.SamplingUnitTable.SAMPLING_UNIT.ENTITY_ID, null);
		}
		else {
			setValue(org.openforis.calc.persistence.jooq.tables.SamplingUnitTable.SAMPLING_UNIT.ENTITY_ID, value.getValue(org.openforis.calc.persistence.jooq.tables.EntityTable.ENTITY.ID));
		}
	}

	/**
	 * The table column <code>calc.sampling_unit.entity_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT sampling_unit__sampling_unit_entity_fkey
	 * FOREIGN KEY (entity_id)
	 * REFERENCES calc.entity (id)
	 * </pre></code>
	 */
	public org.openforis.calc.persistence.jooq.tables.records.EntityRecord fetchEntityTable() {
		return create()
			.selectFrom(org.openforis.calc.persistence.jooq.tables.EntityTable.ENTITY)
			.where(org.openforis.calc.persistence.jooq.tables.EntityTable.ENTITY.ID.equal(getValue(org.openforis.calc.persistence.jooq.tables.SamplingUnitTable.SAMPLING_UNIT.ENTITY_ID)))
			.fetchOne();
	}

	/**
	 * The table column <code>calc.sampling_unit.stratum</code>
	 */
	public void setStratum(java.lang.Integer value) {
		setValue(org.openforis.calc.persistence.jooq.tables.SamplingUnitTable.SAMPLING_UNIT.STRATUM, value);
	}

	/**
	 * The table column <code>calc.sampling_unit.stratum</code>
	 */
	public java.lang.Integer getStratum() {
		return getValue(org.openforis.calc.persistence.jooq.tables.SamplingUnitTable.SAMPLING_UNIT.STRATUM);
	}

	/**
	 * The table column <code>calc.sampling_unit.panel</code>
	 */
	public void setPanel(java.lang.Integer value) {
		setValue(org.openforis.calc.persistence.jooq.tables.SamplingUnitTable.SAMPLING_UNIT.PANEL, value);
	}

	/**
	 * The table column <code>calc.sampling_unit.panel</code>
	 */
	public java.lang.Integer getPanel() {
		return getValue(org.openforis.calc.persistence.jooq.tables.SamplingUnitTable.SAMPLING_UNIT.PANEL);
	}

	/**
	 * The table column <code>calc.sampling_unit.cluster</code>
	 */
	public void setCluster(java.lang.String value) {
		setValue(org.openforis.calc.persistence.jooq.tables.SamplingUnitTable.SAMPLING_UNIT.CLUSTER, value);
	}

	/**
	 * The table column <code>calc.sampling_unit.cluster</code>
	 */
	public java.lang.String getCluster() {
		return getValue(org.openforis.calc.persistence.jooq.tables.SamplingUnitTable.SAMPLING_UNIT.CLUSTER);
	}

	/**
	 * The table column <code>calc.sampling_unit.unit_no</code>
	 */
	public void setUnitNo(java.lang.Integer value) {
		setValue(org.openforis.calc.persistence.jooq.tables.SamplingUnitTable.SAMPLING_UNIT.UNIT_NO, value);
	}

	/**
	 * The table column <code>calc.sampling_unit.unit_no</code>
	 */
	public java.lang.Integer getUnitNo() {
		return getValue(org.openforis.calc.persistence.jooq.tables.SamplingUnitTable.SAMPLING_UNIT.UNIT_NO);
	}

	/**
	 * The table column <code>calc.sampling_unit.location</code>
	 * <p>
	 * The SQL type of this item (USER-DEFINED, geometry) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public void setLocation(java.lang.Object value) {
		setValue(org.openforis.calc.persistence.jooq.tables.SamplingUnitTable.SAMPLING_UNIT.LOCATION, value);
	}

	/**
	 * The table column <code>calc.sampling_unit.location</code>
	 * <p>
	 * The SQL type of this item (USER-DEFINED, geometry) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public java.lang.Object getLocation() {
		return getValue(org.openforis.calc.persistence.jooq.tables.SamplingUnitTable.SAMPLING_UNIT.LOCATION);
	}

	/**
	 * The table column <code>calc.sampling_unit.shape</code>
	 * <p>
	 * The SQL type of this item (USER-DEFINED, geometry) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public void setShape(java.lang.Object value) {
		setValue(org.openforis.calc.persistence.jooq.tables.SamplingUnitTable.SAMPLING_UNIT.SHAPE, value);
	}

	/**
	 * The table column <code>calc.sampling_unit.shape</code>
	 * <p>
	 * The SQL type of this item (USER-DEFINED, geometry) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public java.lang.Object getShape() {
		return getValue(org.openforis.calc.persistence.jooq.tables.SamplingUnitTable.SAMPLING_UNIT.SHAPE);
	}

	/**
	 * The table column <code>calc.sampling_unit.sampling_phase</code>
	 */
	public void setSamplingPhase(java.lang.Integer value) {
		setValue(org.openforis.calc.persistence.jooq.tables.SamplingUnitTable.SAMPLING_UNIT.SAMPLING_PHASE, value);
	}

	/**
	 * The table column <code>calc.sampling_unit.sampling_phase</code>
	 */
	public java.lang.Integer getSamplingPhase() {
		return getValue(org.openforis.calc.persistence.jooq.tables.SamplingUnitTable.SAMPLING_UNIT.SAMPLING_PHASE);
	}

	/**
	 * The table column <code>calc.sampling_unit.permanent</code>
	 */
	public void setPermanent(java.lang.Boolean value) {
		setValue(org.openforis.calc.persistence.jooq.tables.SamplingUnitTable.SAMPLING_UNIT.PERMANENT, value);
	}

	/**
	 * The table column <code>calc.sampling_unit.permanent</code>
	 */
	public java.lang.Boolean getPermanent() {
		return getValue(org.openforis.calc.persistence.jooq.tables.SamplingUnitTable.SAMPLING_UNIT.PERMANENT);
	}

	/**
	 * Create a detached SamplingUnitRecord
	 */
	public SamplingUnitRecord() {
		super(org.openforis.calc.persistence.jooq.tables.SamplingUnitTable.SAMPLING_UNIT);
	}
}