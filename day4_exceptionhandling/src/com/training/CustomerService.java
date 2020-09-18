package com.training;

public class CustomerService {
	
	public String generateUserId(Customer cust) {
		
		String userId = "";
		try {
			int firstPart = Integer.parseInt(cust.getCustomerId());
			String secondPart = cust.getEmail().substring(1, 4);
			
			userId = firstPart + secondPart;
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.err.println("CustomerID should be a number");
			e.printStackTrace();
		}
		
		return userId;
	}
	
	public void printCustomer (Customer cust) {
		
		try {
			System.out.println(cust.getCustomerName().length());
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.err.println("Customer name can not be empty.");
			e.printStackTrace();
		}
		
		System.out.println("Outside Catch Block.");
		
	}

	public String encryptEmail(Customer cust) {
		
		String email = cust.getEmail();
		
		boolean status = email.contains("@");
		
		if (!status) {
			try {
				throw new Exception("Invalid Email Id.");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				e.printStackTrace();
			} finally {
				System.err.println("Inside Finally Block");
			}
		}
		return "";
	}
}
