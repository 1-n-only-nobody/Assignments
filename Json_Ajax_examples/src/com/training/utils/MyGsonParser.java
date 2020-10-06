/**
 * 
 */
package com.training.utils;

import com.google.gson.Gson;
import com.training.entity.Student;

/**
 * @author manan
 *
 */
public class MyGsonParser {

	private Gson gsonParser;
	/**
	 * 
	 */
	public MyGsonParser() {
		super();
		this.gsonParser = new Gson();
	}
	
	public String transformToGson(Object srcObject) {
		
		return gsonParser.toJson(srcObject);
	}
	
	public String transformToGsonArray(Object srcObject) {
		
		return gsonParser.toJson(srcObject);
	}

	public Object gsonToJava(String srcString, Class cls) {
		
		return gsonParser.fromJson(srcString, cls);
	}
	
}
