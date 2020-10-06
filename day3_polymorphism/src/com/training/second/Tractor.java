package com.training.second;

import com.training.ifaces.Automobile;

public class Tractor implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Red";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "TractorModel1";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 400000.00;
	}

}
