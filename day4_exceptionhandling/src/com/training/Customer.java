package com.training;

public class Customer {
	
	private String customerName;
	private int customerId;
	private String email;
	private long mobileNumber;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Customer(String customerName, int customerId, String email, long mobileNumber) {
		super();
		this.customerName = customerName;
		this.customerId = customerId;
		this.email = email;
		this.mobileNumber = mobileNumber;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public long getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	

}
