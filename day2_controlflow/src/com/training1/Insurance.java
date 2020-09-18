package com.training1;

public class Insurance {
	
	private int policyNumber;
	private String policyHolderName;
	private int age;
	private double insuredAmount;
	
	public Insurance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Insurance(int policyNumber, String policyHolderName, int age, double insuredAmount) {
		super();
		this.policyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
		this.age = age;
		this.insuredAmount = insuredAmount;
	}

	public int getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getPolicyHolderName() {
		return policyHolderName;
	}

	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getinsuredAmount() {
		return insuredAmount;
	}

	public void setinsuredAmount(double insuredAmount) {
		this.insuredAmount = insuredAmount;
	}
	
	public double calculatePremium() {
		
		double premium;
		
		if (age < 25 ) {
			premium = ( insuredAmount * 0.6 );
		}
		else {
			premium = ( insuredAmount * 0.7 );
		}
		return premium;
	}

	@Override
	public String toString() {
		return "Insurance [policyNumber=" + policyNumber + ", policyHolderName=" + policyHolderName + ", age=" + age
				+ ", insuredAmount=" + insuredAmount + "]";
	}
}
