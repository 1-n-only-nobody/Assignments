package com.training.first;

public class Lawyer extends ServiceProvider {

	private String type;
	private String qualification;
	
	public Lawyer(long phoneNumber, String firstName, String type, String qualification) {
		super(phoneNumber, firstName);
		this.type = type;
		this.qualification = qualification;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	@Override
	public double calculateFees() {
		// TODO Auto-generated method stub
		double fees = 3000.0;
		
		if(this.type.equalsIgnoreCase("SupremeCourt")) {
			fees = 10000.0;
		}
		
		return fees;
	}
	
}
