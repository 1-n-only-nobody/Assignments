package com.training.third;

import com.training.ifaces.Rentable;

public class Computer implements Rentable {

	private String model;
	private String productId;
	private double ratePerDay;
	private int quantity;
	
	
	public Computer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Computer(String model, String productId, double ratePerDay, int quantity) {
		super();
		this.model = model;
		this.productId = productId;
		this.ratePerDay = ratePerDay;
		this.quantity = quantity;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public void setRatePerDay(double ratePerDay) {
		this.ratePerDay = ratePerDay;
	}

	@Override
	public String getProductId() {
		// TODO Auto-generated method stub
		return productId;
	}

	@Override
	public String getModel() {
		return model;
	}

	@Override
	public double getRatePerDay() {
		// TODO Auto-generated method stub
		return ratePerDay;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
