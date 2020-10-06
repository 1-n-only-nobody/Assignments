package com.training.entity;
/**
 * 
 */

/**
 * @author manan
 *
 */
public class VehicleInsurance extends Insurance {

	private String vehicleModel;

	/**
	 * 
	 */
	public VehicleInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param policyNumber
	 */
	public VehicleInsurance(int policyNumber) {
		super(policyNumber);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param policyNumber
	 * @param vehicleModel
	 */
	public VehicleInsurance(int policyNumber, String vehicleModel) {
		super(policyNumber);
		this.vehicleModel = vehicleModel;
	}

	/**
	 * @return the vehicleModel
	 */
	public String getVehicleModel() {
		return vehicleModel;
	}

	/**
	 * @param vehicleModel the vehicleModel to set
	 */
	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	@Override
	public String toString() {
		return "VehicleInsurance [vehicleModel=" + vehicleModel + "]";
	}
	
}
