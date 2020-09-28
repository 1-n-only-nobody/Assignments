package com.training;

public class BlooDonor {
	private String custID;
	private int custNo;
	private String bloodType;
	private int mlblood;
	
	public BlooDonor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public BlooDonor(String custID, int custNo, String bloodType, int mlblood) {
		super();
		this.custID = custID;
		this.custNo = custNo;
		this.bloodType = bloodType;
		this.mlblood = mlblood;
	}
	
	public String getCustID() {
		return custID;
	}
	public void setCustID(String custID) {
		this.custID = custID;
	}
	public int getCustNo() {
		return custNo;
	}
	public void setCustNo(int custNo) {
		this.custNo = custNo;
	}
	public String getBloodType() {
		return bloodType;
	}
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
	public int getMlblood() {
		return mlblood;
	}
	public void setMlblood(int mlblood) {
		this.mlblood = mlblood;
	}

}
