package com.sinergia.springbatch.test.util;

import com.google.gson.Gson;

public class Util {
	
	private static Gson gson = new Gson();
	
	
	public static <T> T  jsonToObject(String json, Class<T> clazz){
		T t1 = gson.fromJson(json, clazz);
		return t1;
	}
	
	
}
