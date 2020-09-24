package com.training.first;

import com.training.exceptions.RangeCheckException;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Customer ram = new Customer();
			
			ram.setCustomerId("202");
			ram.setEmail("ramabc.com");
			ram.setMobileNumber(999999999);
			ram.setCustomerName("Ramesh");
			
			CustomerService custServ = new CustomerService();
			
			custServ.printCustomer(ram);
			System.out.println(custServ.generateUserId(ram));
			
			System.out.println(custServ.encryptEmail(ram));
		}
		catch(RangeCheckException e) {
			System.err.println(e.getMessage());
		}
		catch(Exception e) {
			System.err.println("Mobile number should be positive.");
			e.printStackTrace();
		}
		
		

	}

}
