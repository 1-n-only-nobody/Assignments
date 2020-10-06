package com.training.entity;
/**
 * 
 */

/**
 * @author manan
 *
 */
public class MyGenerics<T> {

	private T object;

	private Object obj;
	/**
	 * 
	 */
	public MyGenerics() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the object
	 */
	public T getObject() {
		return object;
	}

	/**
	 * @param object the object to set
	 */
	public void setObject(T object) {
		this.object = object;
	}

	/**
	 * @return the obj
	 */
	public Object getObj() {
		return obj;
	}

	/**
	 * @param obj the obj to set
	 */
	public void setObj(Object obj) {
		this.obj = obj;
	}
	
}
