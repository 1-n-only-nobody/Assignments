/**
 * 
 */
package com.training.services;

import java.util.List;

import com.training.entity.Insurance;
import com.training.entity.VehicleInsurance;

/**
 * @author manan
 *
 */
public class InsuranceService {

//	Producer --> extends
//	Consumer --> super
//	Short: PECS
	public static void InsuranceProducer(List<? extends Insurance> list) {
//		cannot add any object only read
//		cannot guarantee what type of list it points to
//		list.add(new LifeInsurance());
		
		for (Insurance eachItem : list) {
			System.out.println(eachItem.getPolicyNumber());
			
		}
	}
	
	public static void InsuranceConsumer(List<? super VehicleInsurance> list) {

		list.add(new VehicleInsurance(45,"Scooty Pep"));
		
//		cannot read any object only add
//		for (VehicleInsurance eachItem : list) {
//			System.out.println(eachItem.getPolicyNumber());
//			
//		}
	}
}
