package com.training;

public class ManageProduct {
	
	//Example for If-Else
	public Product[] calculateDiscount(Product[] productList) {
		
		double discount = 0.0;
		
		for (Product eachProduct : productList) {
			
			if (eachProduct.getRatePerUnit() > 500 && eachProduct.getRatePerUnit() <= 1000) {
				
				discount = 0.10;
			}
			else if (eachProduct.getRatePerUnit() > 1000) {
				
				discount = 0.15;
			}
			eachProduct.setDiscount(discount);
		}
		return productList;
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
	
	public void showProductsLegacy(Product[] productList) {
		
		for (int i = 0; i < productList.length; i++) {
			
			System.out.println("Product : " + i + " => " + productList[i].getProductName());
		}
	}
	
	public void showProductsForEach(Product[] productList) {
		
		for (Product eachProduct : productList) {
			
			System.out.println(eachProduct.getProductName() + " : " + eachProduct.getRatePerUnit());
		}
	}
	
	public double calculateAmount(Product product) {
		
		double amountFinal = 0;
		amountFinal = ( product.getRatePerUnit() * product.getQuantity() ) - ( ( product.getQuantity() * product.getRatePerUnit() )* product.getDiscount() );
		return amountFinal;
	}
}
