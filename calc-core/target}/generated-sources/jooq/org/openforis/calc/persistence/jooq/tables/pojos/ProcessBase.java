/**
 * This class is generated by jOOQ
 */
package org.openforis.calc.persistence.jooq.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.5.0"},
                            comments = "This class is generated by jOOQ")
public class ProcessBase implements java.io.Serializable {

	private static final long serialVersionUID = -437725689;

	private java.lang.Integer id;
	private java.lang.Integer chainId;
	private java.lang.Integer operationId;
	private java.lang.String  name;
	private java.lang.String  description;
	private java.lang.Integer order;

	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	public java.lang.Integer getChainId() {
		return this.chainId;
	}

	public void setChainId(java.lang.Integer chainId) {
		this.chainId = chainId;
	}

	public java.lang.Integer getOperationId() {
		return this.operationId;
	}

	public void setOperationId(java.lang.Integer operationId) {
		this.operationId = operationId;
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getDescription() {
		return this.description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	public java.lang.Integer getOrder() {
		return this.order;
	}

	public void setOrder(java.lang.Integer order) {
		this.order = order;
	}
}
