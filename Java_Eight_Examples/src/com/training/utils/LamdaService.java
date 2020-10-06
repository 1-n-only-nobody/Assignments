package com.training.utils;

//import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class PrintNumbers implements Runnable{

	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
	}
	
	
}

public class LamdaService {

	public void usingJavaFunctionalInterfaces() {
		
		Predicate<Integer> checkAge = (age) -> age > 45 ? true : false;
		
		List<Integer> ageList = Arrays.asList(50,60,20,30,89);
		
		for (Integer eachEntry : ageList) {
			
			if (checkAge.test(eachEntry)) {
				System.out.println("Value satisfies condition");
			}
		}
	}
	
	public void usingWithoutLamda() {
		
		Thread thread = new Thread(new PrintNumbers());
		
		thread.start();
	}
	

	public void usingWithLamda() {
		
		Runnable printTo10 = () -> {
			
			for (int i = 1; i <= 10; i++) {
				System.out.println(i);
			}
		};
		
		Runnable print10To20 = () -> {
			
			for (int i = 11; i <= 20; i++) {
				System.out.println(i);
			}
		};
		
		Thread thread1 = new Thread(printTo10);
		
		Thread thread2 = new Thread(print10To20);
		
		System.out.println(printTo10);
		System.out.println(print10To20);
		
		thread1.start();
		thread2.start();
	}
	
//	public void rethrowException() throws IOException, NullPointerException{
//		
//		int[] marks = {45, 56, 78};
//		String name = null;
//		
//		try {
//			
//			System.out.println(marks[5]);
//			System.out.println(name.length());
//			System.in.read();
//			
//		} catch (Exception e) {
//			throw e;
//		}
//	}
}
