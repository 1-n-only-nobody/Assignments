package com.training.first;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lawyer rajesh = new Lawyer(49494949, "Rajesh Khannan", "High Court", "B.L");
		
		Musician sharma = new Musician(232323, "Umesh Khanna", "Shenoy", "Allahbad");
		
		Billing bill = new Billing();
		
		bill.printFees(sharma);
		
		bill.printFees(rajesh);
		
		WrapperAndStatic obj = new WrapperAndStatic();
		
		obj.parse("1234");
		
		System.out.println(obj.useToString(1234).length());
		
		System.out.println(obj.useValueOf());
	}

}
