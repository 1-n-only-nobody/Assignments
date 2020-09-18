package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer ram = new Customer();
		
		ram.setCustomerId(202);
		ram.setEmail("ram@abc.com");
		ram.setMobileNumber(5486218);
		
		CustomerService custServ = new CustomerService();
		
		custServ.printCustomer(ram);

	}

}
