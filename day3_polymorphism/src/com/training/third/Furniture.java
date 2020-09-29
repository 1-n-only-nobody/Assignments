package com.training.third;

import com.training.ifaces.Rentable;

public class Furniture implements Rentable {

	private String model;
	private String productId;
	private double ratePerDay;
	private int quantity;
	
	public Furniture() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Furniture(String model, String productId, double ratePerDay, int quantity) {
		super();
		this.model = model;
		this.productId = productId;
		this.ratePerDay = ratePerDay;
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public void setRatePerDay(double ratePerDay) {
		this.ratePerDay = ratePerDay;
	}

	public String getModel() {
		// TODO Auto-generated method stub
		return model;
	}

	public String getProductId() {
		// TODO Auto-generated method stub
		return productId;
	}

	public double getRatePerDay() {
		// TODO Auto-generated method stub
		return ratePerDay;
	}

	@Override
	public double calulateRent() {
		// TODO Auto-generated method stub
		double rentAmount = this.ratePerDay * this.quantity;
		return rentAmount;
	}

}
