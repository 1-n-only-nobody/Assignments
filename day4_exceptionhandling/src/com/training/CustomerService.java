package com.training;

public class CustomerService {
	
	public void printCustomer (Customer cust) {
		
		try {
			System.out.println(cust.getCustomerName().length());
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.err.println("Customer name can not be empty.");
			e.printStackTrace();
		}
		
	}

}
