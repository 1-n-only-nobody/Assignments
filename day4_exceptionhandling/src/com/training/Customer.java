package com.training;

public class Customer {
	
	private String customerName;
	private String customerId;
	private String email;
	private long mobileNumber;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Customer(String customerName, String customerId, String email, long mobileNumber) {
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


	public String getCustomerId() {
		return customerId;
	}


	public void setCustomerId(String customerId) {
		
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


	public void setMobileNumber(long mobileNumber) throws Exception {
		
		if (mobileNumber < 0 || mobileNumber > 99999) {
			
			throw new Exception("Invalid Mobile Number");
		}
		this.mobileNumber = mobileNumber;
	}


	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", email=" + email
				+ ", mobileNumber=" + mobileNumber + "]";
	}
	
	
	
}
