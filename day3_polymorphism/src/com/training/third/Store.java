package com.training.third;

import com.training.ifaces.Rentable;

public class Store {

	public Rentable getProduct(int key) {
		
		switch (key) {
		
		case 1:
			
			return new Computer("Alienware", "A2020", 5000, 4);
		
		case 2:
			
			return new Furniture("MahoganyChair", "C2016", 1000, 7);
			
		default:
			
			return null;
		}
	}
	
	public void printDetails (Rentable polyRent) {
		
		System.out.println(Rentable.APPNAME);
		
		System.out.println(polyRent.getModel());
		System.out.println(polyRent.getProductId());
		System.out.println(polyRent.getRatePerDay());
		System.out.println(polyRent.getQuantity());
		
	}
	
	public double calculateRent(Rentable polyRent, int days) {
		
		double rentAmount;
		rentAmount = polyRent.getRatePerDay() * polyRent.getQuantity() * days;
		return rentAmount;
	}
}
