/**
 * This class is generated by jOOQ
 */
package org.openforis.calc.persistence.jooq.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.5.0"},
                            comments = "This class is generated by jOOQ")
public class PlotSurveyBase implements java.io.Serializable {

	private static final long serialVersionUID = -1048989137;

	private java.lang.Integer id;
	private java.lang.Integer surveyId;
	private java.lang.Integer plotId;
	private java.lang.Integer obsUnitId;
	private java.lang.Integer sectionNo;
	private java.sql.Date     surveyDate;
	private java.lang.Object  gpsReading;
	private java.lang.Double  direction;
	private java.lang.Double  distance;
	private java.lang.Object  location;
	private java.lang.Boolean accessible;
	private java.lang.Integer parentId;
	private java.lang.String  surveyType;
	private java.lang.Integer step;
	private java.lang.Integer sourceId;
	private java.lang.Object  shape;
	private java.lang.Integer area;
	private java.lang.Double  percentShare;

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

	public java.lang.Integer getPlotId() {
		return this.plotId;
	}

	public void setPlotId(java.lang.Integer plotId) {
		this.plotId = plotId;
	}

	public java.lang.Integer getObsUnitId() {
		return this.obsUnitId;
	}

	public void setObsUnitId(java.lang.Integer obsUnitId) {
		this.obsUnitId = obsUnitId;
	}

	public java.lang.Integer getSectionNo() {
		return this.sectionNo;
	}

	public void setSectionNo(java.lang.Integer sectionNo) {
		this.sectionNo = sectionNo;
	}

	public java.sql.Date getSurveyDate() {
		return this.surveyDate;
	}

	public void setSurveyDate(java.sql.Date surveyDate) {
		this.surveyDate = surveyDate;
	}

	public java.lang.Object getGpsReading() {
		return this.gpsReading;
	}

	public void setGpsReading(java.lang.Object gpsReading) {
		this.gpsReading = gpsReading;
	}

	public java.lang.Double getDirection() {
		return this.direction;
	}

	public void setDirection(java.lang.Double direction) {
		this.direction = direction;
	}

	public java.lang.Double getDistance() {
		return this.distance;
	}

	public void setDistance(java.lang.Double distance) {
		this.distance = distance;
	}

	public java.lang.Object getLocation() {
		return this.location;
	}

	public void setLocation(java.lang.Object location) {
		this.location = location;
	}

	public java.lang.Boolean getAccessible() {
		return this.accessible;
	}

	public void setAccessible(java.lang.Boolean accessible) {
		this.accessible = accessible;
	}

	public java.lang.Integer getParentId() {
		return this.parentId;
	}

	public void setParentId(java.lang.Integer parentId) {
		this.parentId = parentId;
	}

	public java.lang.String getSurveyType() {
		return this.surveyType;
	}

	public void setSurveyType(java.lang.String surveyType) {
		this.surveyType = surveyType;
	}

	public java.lang.Integer getStep() {
		return this.step;
	}

	public void setStep(java.lang.Integer step) {
		this.step = step;
	}

	public java.lang.Integer getSourceId() {
		return this.sourceId;
	}

	public void setSourceId(java.lang.Integer sourceId) {
		this.sourceId = sourceId;
	}

	public java.lang.Object getShape() {
		return this.shape;
	}

	public void setShape(java.lang.Object shape) {
		this.shape = shape;
	}

	public java.lang.Integer getArea() {
		return this.area;
	}

	public void setArea(java.lang.Integer area) {
		this.area = area;
	}

	public java.lang.Double getPercentShare() {
		return this.percentShare;
	}

	public void setPercentShare(java.lang.Double percentShare) {
		this.percentShare = percentShare;
	}
}
