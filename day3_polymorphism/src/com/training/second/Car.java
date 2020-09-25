package com.training.second;

import com.training.ifaces.Automobile;

public class Car implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Red";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Toyota ALTIS";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 800000.00;
	}

}
