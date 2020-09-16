package com.training1;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insurance policyHolder1 = new Insurance(123, "Abcdef", 30, 50000);
		Insurance policyHolder2 = new Insurance(234, "Zyxwvu", 10, 20000);
		
		ManageInsurance mgr = new ManageInsurance();
		
		double premium;
		
		premium = mgr.calculatePremium(policyHolder1);
		
		System.out.println("Name : " + policyHolder1.getPolicyHolderName() + ", Premium : " + premium);
		
		premium = mgr.calculatePremium(policyHolder2);
		
		System.out.println("Name : " + policyHolder2.getPolicyHolderName() + ", Premium : " + premium);
	}

}
