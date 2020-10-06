package com.training.second;

import com.training.ifaces.Automobile;

public class Showroom {

	//Method returns object based on the key passed --> Factory Method
	//Here returns object of type Automobile
	public Automobile getProduct(int key) {
		
		switch (key) {
		
		case 1:
			
			return new Bike();
		
		case 2:
			
			return new Car();
			
		default:
			
			return null;
		}
	}
	
	public void printEstimate (Automobile polyAuto) {
		
		System.out.println(Automobile.APPNAME);
		
		System.out.println(polyAuto.getModel());
		System.out.println(polyAuto.getColor());
		System.out.println(polyAuto.getPrice());
		
	}
}
