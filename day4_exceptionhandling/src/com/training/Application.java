package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Customer ram = new Customer();
			
			ram.setCustomerId("202");
			ram.setEmail("ram@abc.com");
			ram.setMobileNumber(999);
			ram.setCustomerName("Ramesh");
			
			CustomerService custServ = new CustomerService();
			
			custServ.printCustomer(ram);
			System.out.println(custServ.generateUserId(ram));
		}
		catch(Exception e) {
			System.err.println("Mobile number should be positive.");
			e.printStackTrace();
		}
		
		

	}

}
