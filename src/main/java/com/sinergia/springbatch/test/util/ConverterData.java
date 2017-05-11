package com.sinergia.springbatch.test.util;

import java.io.IOException;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class ConverterData<T> implements AttributeConverter<T, String> {

	ObjectMapper OBJECT_MAPPER = new ObjectMapper();
	
	@Override
	public String convertToDatabaseColumn(T t) {
		
		try {
			return OBJECT_MAPPER.writeValueAsString(t);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public T convertToEntityAttribute(String dbData) {
		
		try {
			return OBJECT_MAPPER.readValue(dbData, getType());
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	protected abstract TypeReference<T> getType();
	
}
