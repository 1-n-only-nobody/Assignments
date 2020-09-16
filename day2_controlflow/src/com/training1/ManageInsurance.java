package com.training1;

public class ManageInsurance {
	
	public double calculatePremium(Insurance policyHolder) {
		
		double premium;
		if (policyHolder.getAge() < 25 ) {
			premium = ( policyHolder.getInsuredAmount() * 0.6 );
		}
		else {
			premium = ( policyHolder.getInsuredAmount() * 0.7 );
		}
		return premium;
	}
}
