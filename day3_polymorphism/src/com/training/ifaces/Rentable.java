package com.training.ifaces;

public interface Rentable {

	String APPNAME = "Calculate Rent";
	
	double getRatePerDay();
	String getModel();
	String getProductId();
	int getQuantity();
}
