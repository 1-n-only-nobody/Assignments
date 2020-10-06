package com.training.entity;
/**
 * 
 */

/**
 * @author manan
 *
 */
public abstract class Insurance {

	private int policyNumber;

	/**
	 * 
	 */
	public Insurance() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param policyNumber
	 */
	public Insurance(int policyNumber) {
		super();
		this.policyNumber = policyNumber;
	}

	/**
	 * @return the policyNumber
	 */
	public int getPolicyNumber() {
		return policyNumber;
	}

	/**
	 * @param policyNumber the policyNumber to set
	 */
	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}
	
}
