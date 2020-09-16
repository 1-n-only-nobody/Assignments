package com.training1;

public class Insurance {
	
	private int policyNumber;
	private String policyHolderName;
	private int age;
	private double InsuredAmount;
	
	public Insurance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Insurance(int policyNumber, String policyHolderName, int age, double insuredAmount) {
		super();
		this.policyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
		this.age = age;
		InsuredAmount = insuredAmount;
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

	public double getInsuredAmount() {
		return InsuredAmount;
	}

	public void setInsuredAmount(double insuredAmount) {
		InsuredAmount = insuredAmount;
	}
	
}
