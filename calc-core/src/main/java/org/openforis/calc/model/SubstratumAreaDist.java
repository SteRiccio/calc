package org.openforis.calc.model;

// Generated Aug 8, 2012 5:42:26 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * SubstratumAreaDist generated by hbm2java
 */
@Entity
@Table(name = "substratum_area_dist")
public class SubstratumAreaDist implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private SubstratumAreaDistId id;

	public SubstratumAreaDist() {
	}

	public SubstratumAreaDist(SubstratumAreaDistId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "stratumId", column = @Column(name = "stratum_id")), @AttributeOverride(name = "adminUnitId", column = @Column(name = "admin_unit_id")),
			@AttributeOverride(name = "class1Id", column = @Column(name = "class1_id")), @AttributeOverride(name = "class2Id", column = @Column(name = "class2_id")),
			@AttributeOverride(name = "proportion", column = @Column(name = "proportion", precision = 17, scale = 17)),
			@AttributeOverride(name = "estArea", column = @Column(name = "est_area", precision = 17, scale = 17)) })
	public SubstratumAreaDistId getId() {
		return this.id;
	}

	public void setId(SubstratumAreaDistId id) {
		this.id = id;
	}

}
