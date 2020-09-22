package com.training.second;

import com.training.ifaces.Automobile;

public class TractorShowroom extends Showroom {

	@Override
	public Automobile getProduct(int key) {
		// TODO Auto-generated method stub
		if ( key == 3 ) {
			return new Tractor();
		}
		return super.getProduct(key);
	}

}
