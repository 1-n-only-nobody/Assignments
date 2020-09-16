package com.training1;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insurance policyHolder1 = new Insurance(123, "Abcdef", 30, 50000);
		Insurance policyHolder2 = new Insurance(234, "Zyxwvu", 10, 20000);
		
//		ManageInsurance mgr = new ManageInsurance();
		
		double premium;
		
		premium = policyHolder1.calculatePremium();
		
		System.out.println("Name : " + policyHolder1.getPolicyHolderName() + ", Premium : " + premium);
		
		premium = policyHolder2.calculatePremium();
		
		System.out.println("Name : " + policyHolder2.getPolicyHolderName() + ", Premium : " + premium);
		
		
		
		VehicleInsurance vehiclePolicyHolder1 = new VehicleInsurance(456, "Qwerty", 20, 25000, "2", 1, 50000);
		
		VehicleInsurance vehiclePolicyHolder2 = new VehicleInsurance(567, "Poiuy", 40, 78000, "4", 3, 70000);
		
		premium = vehiclePolicyHolder1.calculatePremium();
		
		System.out.println("Name : " + vehiclePolicyHolder1.getPolicyHolderName() + ", Premium : " + premium);
		
		premium = vehiclePolicyHolder2.calculatePremium();
		
		System.out.println("Name : " + vehiclePolicyHolder2.getPolicyHolderName() + ", Premium : " + premium);
	}

}
