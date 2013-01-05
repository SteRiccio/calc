/**
 * This class is generated by jOOQ
 */
package org.openforis.calc.persistence.jooq;

/**
 * This class is generated by jOOQ.
 *
 * Convenience access to all sequences in calc
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.5.0"},
                            comments = "This class is generated by jOOQ")
public final class Sequences {

	/**
	 * The sequence calc.aoi_hierarchy_id_seq
	 */
	public static final org.jooq.Sequence<java.lang.Long> AOI_HIERARCHY_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("aoi_hierarchy_id_seq", org.openforis.calc.persistence.jooq.CalcTable.CALC, org.jooq.impl.SQLDataType.BIGINT);

	/**
	 * The sequence calc.aoi_id_seq
	 */
	public static final org.jooq.Sequence<java.lang.Long> AOI_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("aoi_id_seq", org.openforis.calc.persistence.jooq.CalcTable.CALC, org.jooq.impl.SQLDataType.BIGINT);

	/**
	 * The sequence calc.category_id_seq
	 */
	public static final org.jooq.Sequence<java.lang.Long> CATEGORY_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("category_id_seq", org.openforis.calc.persistence.jooq.CalcTable.CALC, org.jooq.impl.SQLDataType.BIGINT);

	/**
	 * The sequence calc.cluster_id_seq
	 */
	public static final org.jooq.Sequence<java.lang.Long> CLUSTER_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("cluster_id_seq", org.openforis.calc.persistence.jooq.CalcTable.CALC, org.jooq.impl.SQLDataType.BIGINT);

	/**
	 * The sequence calc.observation_unit_id_seq
	 */
	public static final org.jooq.Sequence<java.lang.Long> OBSERVATION_UNIT_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("observation_unit_id_seq", org.openforis.calc.persistence.jooq.CalcTable.CALC, org.jooq.impl.SQLDataType.BIGINT);

	/**
	 * The sequence calc.operation_id_seq
	 */
	public static final org.jooq.Sequence<java.lang.Long> OPERATION_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("operation_id_seq", org.openforis.calc.persistence.jooq.CalcTable.CALC, org.jooq.impl.SQLDataType.BIGINT);

	/**
	 * The sequence calc.operation_parameter_id_seq
	 */
	public static final org.jooq.Sequence<java.lang.Long> OPERATION_PARAMETER_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("operation_parameter_id_seq", org.openforis.calc.persistence.jooq.CalcTable.CALC, org.jooq.impl.SQLDataType.BIGINT);

	/**
	 * The sequence calc.plot_category_id_seq
	 */
	public static final org.jooq.Sequence<java.lang.Long> PLOT_CATEGORY_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("plot_category_id_seq", org.openforis.calc.persistence.jooq.CalcTable.CALC, org.jooq.impl.SQLDataType.BIGINT);

	/**
	 * The sequence calc.plot_id_seq
	 */
	public static final org.jooq.Sequence<java.lang.Long> PLOT_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("plot_id_seq", org.openforis.calc.persistence.jooq.CalcTable.CALC, org.jooq.impl.SQLDataType.BIGINT);

	/**
	 * The sequence calc.plot_measurement_id_seq
	 */
	public static final org.jooq.Sequence<java.lang.Long> PLOT_MEASUREMENT_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("plot_measurement_id_seq", org.openforis.calc.persistence.jooq.CalcTable.CALC, org.jooq.impl.SQLDataType.BIGINT);

	/**
	 * The sequence calc.plot_survey_id_seq
	 */
	public static final org.jooq.Sequence<java.lang.Long> PLOT_SURVEY_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("plot_survey_id_seq", org.openforis.calc.persistence.jooq.CalcTable.CALC, org.jooq.impl.SQLDataType.BIGINT);

	/**
	 * The sequence calc.process_id_seq
	 */
	public static final org.jooq.Sequence<java.lang.Long> PROCESS_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("process_id_seq", org.openforis.calc.persistence.jooq.CalcTable.CALC, org.jooq.impl.SQLDataType.BIGINT);

	/**
	 * The sequence calc.processing_chain_id_seq
	 */
	public static final org.jooq.Sequence<java.lang.Long> PROCESSING_CHAIN_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("processing_chain_id_seq", org.openforis.calc.persistence.jooq.CalcTable.CALC, org.jooq.impl.SQLDataType.BIGINT);

	/**
	 * The sequence calc.specimen_category_id_seq
	 */
	public static final org.jooq.Sequence<java.lang.Long> SPECIMEN_CATEGORY_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("specimen_category_id_seq", org.openforis.calc.persistence.jooq.CalcTable.CALC, org.jooq.impl.SQLDataType.BIGINT);

	/**
	 * The sequence calc.specimen_id_seq
	 */
	public static final org.jooq.Sequence<java.lang.Long> SPECIMEN_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("specimen_id_seq", org.openforis.calc.persistence.jooq.CalcTable.CALC, org.jooq.impl.SQLDataType.BIGINT);

	/**
	 * The sequence calc.specimen_measurement_id_seq
	 */
	public static final org.jooq.Sequence<java.lang.Long> SPECIMEN_MEASUREMENT_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("specimen_measurement_id_seq", org.openforis.calc.persistence.jooq.CalcTable.CALC, org.jooq.impl.SQLDataType.BIGINT);

	/**
	 * The sequence calc.stratum_id_seq
	 */
	public static final org.jooq.Sequence<java.lang.Long> STRATUM_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("stratum_id_seq", org.openforis.calc.persistence.jooq.CalcTable.CALC, org.jooq.impl.SQLDataType.BIGINT);

	/**
	 * The sequence calc.survey_id_seq
	 */
	public static final org.jooq.Sequence<java.lang.Long> SURVEY_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("survey_id_seq", org.openforis.calc.persistence.jooq.CalcTable.CALC, org.jooq.impl.SQLDataType.BIGINT);

	/**
	 * The sequence calc.taxon_id_seq
	 */
	public static final org.jooq.Sequence<java.lang.Long> TAXON_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("taxon_id_seq", org.openforis.calc.persistence.jooq.CalcTable.CALC, org.jooq.impl.SQLDataType.BIGINT);

	/**
	 * The sequence calc.taxonomic_checklist_id_seq
	 */
	public static final org.jooq.Sequence<java.lang.Long> TAXONOMIC_CHECKLIST_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("taxonomic_checklist_id_seq", org.openforis.calc.persistence.jooq.CalcTable.CALC, org.jooq.impl.SQLDataType.BIGINT);

	/**
	 * The sequence calc.taxon_vernacular_name_id_seq
	 */
	public static final org.jooq.Sequence<java.lang.Long> TAXON_VERNACULAR_NAME_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("taxon_vernacular_name_id_seq", org.openforis.calc.persistence.jooq.CalcTable.CALC, org.jooq.impl.SQLDataType.BIGINT);

	/**
	 * The sequence calc.variable_id_seq
	 */
	public static final org.jooq.Sequence<java.lang.Long> VARIABLE_ID_SEQ = new org.jooq.impl.SequenceImpl<java.lang.Long>("variable_id_seq", org.openforis.calc.persistence.jooq.CalcTable.CALC, org.jooq.impl.SQLDataType.BIGINT);

	/**
	 * No instances
	 */
	private Sequences() {}
}