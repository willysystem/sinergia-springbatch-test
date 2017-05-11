package com.sinergia.springbatch.test.util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.sinergia.springbatch.test.domain.History;

public class ConverterDataImpl extends ConverterData<History>{

	TypeReference<History> type = new TypeReference<History>() {
	};
	
	@Override
	protected TypeReference<History> getType() {
		return type;
	}

}
