package org.openforis.calc.model;

// Generated Aug 8, 2012 5:42:26 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TreeHealth generated by hbm2java
 */
@Entity
@Table(name = "tree_health")
public class TreeHealth implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String code;
	private String name;
	private Set<TreeObs> treeObses = new HashSet<TreeObs>(0);

	public TreeHealth() {
	}

	public TreeHealth(int id) {
		this.id = id;
	}

	public TreeHealth(int id, String code, String name, Set<TreeObs> treeObses) {
		this.id = id;
		this.code = code;
		this.name = name;
		this.treeObses = treeObses;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "code", length = 25)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "treeHealth")
	public Set<TreeObs> getTreeObses() {
		return this.treeObses;
	}

	public void setTreeObses(Set<TreeObs> treeObses) {
		this.treeObses = treeObses;
	}

}
