package com.training.third;

import java.util.Scanner;

import com.training.ifaces.Rentable;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int loopControl = 0;
		double rentAmount;
		
		Store myStore = new Store();
		
		Scanner sc = new Scanner(System.in);
		int key;
		do {
			key = sc.nextInt();
			
			Rentable selected = myStore.getProduct(key);
			
			if ( selected == null ) {
				
				System.out.println("Enter a valid value \"1\" OR \"2\".");
			}
			else {
				loopControl = 1;
				myStore.printDetails(selected);
				System.out.println("Enter no. of days item is rented : ");
				key = sc.nextInt();
				rentAmount = myStore.calculateRent(selected, key);
				System.out.println(rentAmount);
			}
			
			
		}while(loopControl == 0);
	}

}
