package com.training.model;

import java.io.Serializable;

public class CreditCard implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cardHolderName;
	private long cardNumber;
	private transient double creditLimit;
	private int cardCVV;
	
	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CreditCard(String cardHolderName, long cardNumber, double creditLimit, int cardCVV) {
		super();
		this.cardHolderName = cardHolderName;
		this.cardNumber = cardNumber;
		this.creditLimit = creditLimit;
		this.cardCVV = cardCVV;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}

	public int getCardCVV() {
		return cardCVV;
	}

	public void setCardCVV(int cardCVV) {
		this.cardCVV = cardCVV;
	}

	@Override
	public String toString() {
		return cardHolderName + " , " + cardNumber + " , "+ creditLimit + " , " + cardCVV;
	}
	
	
}
