package org.openforis.calc.persistence.jooq.rolap;

import java.util.List;

import org.openforis.calc.model.ObservationUnitMetadata;

/**
 * @author G. Miceli
 * @author M. Togna
 */
public class InterviewFactTable extends FactTable {
	private static final long serialVersionUID = 1L;
	
	InterviewFactTable(String schema, ObservationUnitMetadata unit, List<String> measures, List<String> dimensions) {
		super(schema, unit.getFactTableName(), unit, measures, dimensions);
	}
}