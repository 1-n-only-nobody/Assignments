package com.training.ifaces;

public interface Automobile {

	//following attribute is of type public static final by default
	String APPNAME = "Quotation Generation System";
	
	//all three methods are public and abstract by default
	public abstract String getColor();
	public String getModel();
	double getPrice();
}
