package com.sinergia.springbatch.test.util;

import java.io.IOException;

import javax.inject.Singleton;
import javax.persistence.AttributeConverter;
import javax.persistence.Convert;
import javax.persistence.Converter;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

//@Converter(autoApply = true)
//@Component
//@Convert
public class LocalDateAttributeConverter /* implements AttributeConverter<Object, String>*/ {

	public LocalDateAttributeConverter(){
		
	}
	
//    @Override
    public <T> String convertToDatabaseColumn(T entityValue) {
        if( entityValue == null )
            return null;

        ObjectMapper mapper = new ObjectMapper();

        try {
			return mapper.writeValueAsString(entityValue);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    }

//    @Override
//    public Object convertToEntityAttribute(String databaseValue) {
//        if( databaseValue == null )
//            return null;
//
//        ObjectMapper mapper = new ObjectMapper();
//
//        try {
//			return mapper.readValue(databaseValue, Object.class);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return null;
//
//    }
    
    public <T> T convertToEntityAttribute(String databaseValue, Class<T> clazz) {
    	if( databaseValue == null )
            return null;

        ObjectMapper mapper = new ObjectMapper();

        try {
			return mapper.readValue(databaseValue, clazz);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    } 
    
//    @Bean 
//    public LocalDateAttributeConverter getLocalDateAttributeConverter(){
//  	  return new LocalDateAttributeConverter();
//    } 
//    
    
}