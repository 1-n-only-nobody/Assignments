package com.training.first;

import java.io.IOException;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Thread.currentThread().getName());
		
		new InvokeNumberService(100, "Hundred Count");
		new InvokeNumberService(1000, "Thousand Count");
		new InvokeNumberService(1000, "Ten Thousand Count");
		
		try {
			
			System.out.println("Enter a message : ");
			int key = System.in.read();
			
			System.out.println((char)key);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
