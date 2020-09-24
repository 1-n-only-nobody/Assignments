package com.training.first;

public class Musician extends ServiceProvider {

	private String instrument;
	private String location;
	
	public Musician(long phoneNumber, String firstName, String instrument, String location) {
		super(phoneNumber, firstName);
		this.instrument = instrument;
		this.location = location;
	}

	public String getInstrument() {
		return instrument;
	}

	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public double calculateFees() {
		// TODO Auto-generated method stub
		double fees = 1000.0;
		
		if(this.instrument.equalsIgnoreCase("Tabla") || this.location.equalsIgnoreCase("Chennai")) {
			fees = 5000.0;
		}
		return fees;
	}
	
	
}
