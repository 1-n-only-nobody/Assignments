package com.training.entity;
/**
 * 
 */

/**
 * @author manan
 *
 */
public class LifeInsurance extends Insurance {

	public int age;

	/**
	 * 
	 */
	public LifeInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param policyNumber
	 */
	public LifeInsurance(int policyNumber) {
		super(policyNumber);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param policyNumber
	 * @param age
	 */
	public LifeInsurance(int policyNumber, int age) {
		super(policyNumber);
		this.age = age;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "LifeInsurance [age=" + age + "]";
	}
	
}
