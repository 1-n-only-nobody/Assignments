package com.training;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlooDonor bd1 = new BlooDonor();
		
		bd1.setBloodType("A+");
		bd1.setCustID("ABCD12345");
		bd1.setMlblood(200);
		
		System.out.println(bd1.getBloodType() + " and " + bd1.getCustID() + " and " + bd1.getMlblood());
		
		BlooDonor bd2 = new BlooDonor("XYZW4321", 15486, "B-", 250);
		
		System.out.println(bd2.getBloodType() + " and " + bd2.getCustID() + " and " + bd2.getMlblood());
		
	}

}
