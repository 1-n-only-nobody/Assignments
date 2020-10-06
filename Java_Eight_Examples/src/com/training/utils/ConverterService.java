/**
 * 
 */
package com.training.utils;

/**
 * @author manan
 *
 */
public class ConverterService {
	
	public void usingWithLamda() {
		
		Converter<Double, Double> usdToInr = (usd) -> {
			
			double inr = usd * 75.0;
			
			System.out.println(inr);
			
			return inr;
			
		};
		
		Converter<Double, Double> fhrToCel = (fhr) -> {
			
			double cel = ((fhr - 32.0) * (5.0 / 9.0));
			
			System.out.println(cel);
			
			return cel;
			
		};
		
		usdToInr.convert(80.00);
		fhrToCel.convert(100.00);
	}
	
	public void withConverterArg(Converter<Double, Double> converter, double value) {
		
		converter.convert(value);
	}
	
}
