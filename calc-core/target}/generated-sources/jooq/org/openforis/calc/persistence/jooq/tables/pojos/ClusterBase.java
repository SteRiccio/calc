/**
 * This class is generated by jOOQ
 */
package org.openforis.calc.persistence.jooq.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.5.0"},
                            comments = "This class is generated by jOOQ")
public class ClusterBase implements java.io.Serializable {

	private static final long serialVersionUID = -478148562;

	private java.lang.Integer id;
	private java.lang.Integer surveyId;
	private java.lang.Integer no;
	private java.lang.String  code;
	private java.lang.Integer xIndex;
	private java.lang.Integer yIndex;

	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	public java.lang.Integer getSurveyId() {
		return this.surveyId;
	}

	public void setSurveyId(java.lang.Integer surveyId) {
		this.surveyId = surveyId;
	}

	public java.lang.Integer getNo() {
		return this.no;
	}

	public void setNo(java.lang.Integer no) {
		this.no = no;
	}

	public java.lang.String getCode() {
		return this.code;
	}

	public void setCode(java.lang.String code) {
		this.code = code;
	}

	public java.lang.Integer getXIndex() {
		return this.xIndex;
	}

	public void setXIndex(java.lang.Integer xIndex) {
		this.xIndex = xIndex;
	}

	public java.lang.Integer getYIndex() {
		return this.yIndex;
	}

	public void setYIndex(java.lang.Integer yIndex) {
		this.yIndex = yIndex;
	}
}