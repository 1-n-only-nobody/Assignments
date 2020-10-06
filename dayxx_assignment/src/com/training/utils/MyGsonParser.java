/**
 * 
 */
package com.training.utils;

import com.google.gson.Gson;

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
	
	public String transformToGsonArray(Object srcObjectArray) {
		
		return gsonParser.toJson(srcObjectArray);
	}

	public Object gsonToJava(String srcString, Class cls) {
		
		return gsonParser.fromJson(srcString, cls);
	}
	
}
