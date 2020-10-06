/**
 * 
 */
package com.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.training.entity.LifeInsurance;
import com.training.entity.MyGenerics;
import com.training.entity.VehicleInsurance;
import com.training.services.InsuranceService;

/**
 * @author manan
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		MyGenerics<Integer> rollNumber = new MyGenerics<>();
		
//		TypeSafety cannot pass other type
		rollNumber.setObject(new Integer(200));
		
//		both double and integer can be passed when using Object data type
//		rollNumber.setObj(new Double(100.00));
//		rollNumber.setObj(new Integer(100));
		
		Integer number = rollNumber.getObject();
		
		System.out.println(number);
		
//		need to cast in order to get proper data type
//		Integer mark = (Integer) rollNumber.getObj();
		
		List<LifeInsurance> lifeList = Arrays.asList(new LifeInsurance(1010, 23), new LifeInsurance(2020, 43));
		
		List<VehicleInsurance> vehicleList = new ArrayList<>();
		vehicleList.add(new VehicleInsurance(3030, "activa"));
		vehicleList.add(new VehicleInsurance(4040, "pulsar"));
		
		InsuranceService.InsuranceProducer(lifeList);
		
		InsuranceService.InsuranceProducer(vehicleList);
		
		InsuranceService.InsuranceConsumer(vehicleList);
		
		vehicleList.forEach(System.out::println);
	}

}
