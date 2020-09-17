package com.training.second;

import java.util.Scanner;

import com.training.ifaces.Automobile;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Showroom saiTractors = new TractorShowroom();
		
		Scanner sc = new Scanner(System.in);
		int key;
		do {
			key = sc.nextInt();
			
			if ( key < 1 || key > 3 ) {
				System.out.println("Enter a valid value \"1\" OR \"2\" OR \"3\".");
			}
			
		}while(key<1 || key>3);
//		int key = Integer.parseInt(args[0]);
		
		Automobile selected = saiTractors.getProduct(key);
		
		saiTractors.printEstimate(selected);

		
//		System.out.println(key);
		sc.close();
		
	}

}
