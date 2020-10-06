/**
 * 
 */
package com.training;

import com.training.utils.Converter;
import com.training.utils.ConverterService;
import com.training.utils.LamdaService;

//import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author manan
 *
 */
public class Application {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		LamdaService service = new LamdaService();
		
		service.usingWithoutLamda();
		
		service.usingWithLamda();
		
		service.usingJavaFunctionalInterfaces();
		
//		service.rethrowExcep tion();
		
		ConverterService converterService = new ConverterService();
		
		converterService.usingWithLamda();
		
		Converter<Double, Double> fhrToCel = (fhr) -> {
			
			double cel = ((fhr - 32.0) * (5.0 / 9.0));
			
			System.out.println(cel);
			
			return cel;
			
		};
		
		converterService.withConverterArg(fhrToCel, 95.00);
		
		Consumer<String> consumer = (val) -> { System.out.println(val); };
		
		Consumer<Integer> consumer2 = (val) -> { System.out.println(val); };
		
		consumer.accept("Manan");
		
		List<Integer> ageList = Arrays.asList(50,60,20,30,89);
		
		ageList.forEach(consumer2);
		ageList.forEach(System.out::println);
	}

}
