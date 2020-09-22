package com.training.first;

public abstract class ServiceProvider {
	
	private long phoneNumber;
	private String firstName;
	
	public ServiceProvider(long phoneNumber, String firstName) {
		super();
//		System.out.println("Super Class constructor called!!");
		this.phoneNumber = phoneNumber;
		this.firstName = firstName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public abstract double calculateFees();
}
