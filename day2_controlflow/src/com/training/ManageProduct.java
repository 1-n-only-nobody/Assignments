package com.training;

public class ManageProduct {
	
	//Example for If-Else
	public double calculateDiscount(Product product) {
		
		double discount = 0.0;
		
		if (product.getRatePerUnit() > 500 && product.getRatePerUnit() <= 1000) {
			
			discount = 0.10;
		}
		else if (product.getRatePerUnit() > 1000) {
			
			discount = 0.15;
		}
		return discount;
	}
	
	public double calculateTax(Product product) {
		
		double tax = 0.0;
		
		switch (product.getProductType()) {
		
		case 1 : 
			tax = 0.05;
			break;
		
		case 2 :
			tax = 0.10;
			break;
			
		case 3 :
			tax = 0.15;
			break;
			
		default :
			tax = 0.28;
			break;
		}
		return tax;
	}
	public void showProducts() {
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("product");
		}
	}
}
