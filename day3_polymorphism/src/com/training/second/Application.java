package com.training.second;

import java.util.Scanner;

import com.training.ifaces.Automobile;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int loopControl = 0;
		Showroom saiTractors = new TractorShowroom();
		
		Scanner sc = new Scanner(System.in);
		int key;
		do {
			key = sc.nextInt();
			
			Automobile selected = saiTractors.getProduct(key);
			
			if ( selected == null ) {
				
				System.out.println("Enter a valid value \"1\" OR \"2\" OR \"3\".");
			}
			else {
				loopControl = 1;
				saiTractors.printEstimate(selected);
			}
			
			
		}while(loopControl == 0);
//		int key = Integer.parseInt(args[0]);
		
//		Automobile selected = saiTractors.getProduct(key);
		
//		saiTractors.printEstimate(selected);

		
//		System.out.println(key);
		sc.close();
		
	}

}
