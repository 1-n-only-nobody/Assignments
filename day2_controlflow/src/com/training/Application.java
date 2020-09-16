package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product tv = new Product(1010, "LED TV", 550.00, 3, 2);
		
		ManageProduct mgr = new ManageProduct();
		
//		double discount = mgr.calculateDiscount(tv);
		
//		System.out.println("Discount Percentage :--> " + (discount * 100) + "%");
		
//		double tax = mgr.calculateTax(tv);
//		System.out.println("Tax Percentage :--> " + (tax * 100) + "%");
//		mgr.showProducts();
		
		Product fridge = new Product(200, "fridge", 12030.00, 2, 5);
		
//		Creating an Array of type Product
		
		Product[] productList = new Product[2];
		
//		Placing 2 elements at positions 0 and 1
		
		productList[0] = tv;
		productList[1] = fridge;
		
//		mgr.showProductsForEach(productList);
		
//		mgr.showProductsLegacy(productList);
		
		mgr.calculateDiscount(productList);
		System.out.println("Quantity of TVs : " + tv.getQuantity());
		System.out.println("Quantity of fridges : " + fridge.getQuantity());
		System.out.println("Discount on TVs : " + tv.getDiscount());
		System.out.println("Discount on fridges : " + fridge.getDiscount());
		System.out.println("Price of TVs : " + mgr.calculateAmount(tv));
		System.out.println("Price of fridges : " + mgr.calculateAmount(fridge));
		
	}
	
}
