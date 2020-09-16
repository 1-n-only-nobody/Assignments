package com.training1;

public class VehicleInsurance extends Insurance{
	
	private String vehicleModel;
	private int yearOfManufacture;
	private double costOfVehicle;
	
	public VehicleInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public VehicleInsurance(String vehicleModel, int yearOfManufacture, double costOfVehicle) {
		super();
		this.vehicleModel = vehicleModel;
		this.yearOfManufacture = yearOfManufacture;
		this.costOfVehicle = costOfVehicle;
	}
	
	public VehicleInsurance(int policyNumber, String policyHolderName, int age, double insuredAmount,
			String vehicleModel, int yearOfManufacture, double costOfVehicle) {
		super(policyNumber, policyHolderName, age, insuredAmount);
		this.vehicleModel = vehicleModel;
		this.yearOfManufacture = yearOfManufacture;
		this.costOfVehicle = costOfVehicle;
	}
	
	public String getVehicleModel() {
		return vehicleModel;
	}
	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	public int getYearOfManufacture() {
		return yearOfManufacture;
	}
	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}
	public double getCostOfVehicle() {
		return costOfVehicle;
	}
	public void setCostOfVehicle(double costOfVehicle) {
		this.costOfVehicle = costOfVehicle;
	}

	@Override
	public double calculatePremium() {
		
		double premium;
		switch (vehicleModel) {
		case "2":
			if (yearOfManufacture < 2) {
				premium = 0.50 * costOfVehicle;
			}
			else {
				premium = 0.60 * costOfVehicle;
			}
			break;
		case "4":
			if (yearOfManufacture < 2) {
				premium = 0.40 * costOfVehicle;
			}
			else {
				premium = 0.50 * costOfVehicle;
			}
			break;
		default :
			premium = 10000;
			break;
		}
		// TODO Auto-generated method stub
		return premium;
	}
	
	
	
	
}
