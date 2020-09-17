package com.training.third;

import java.util.Scanner;

import com.training.ifaces.Rentable;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int loopControl = 0;
		double rentAmount;
		int days;
		
		Store myStore = new Store();
		
		Scanner sc = new Scanner(System.in);
		int key;
		do {
			key = sc.nextInt();
			
			Rentable selected = myStore.getProduct(key,"ABC","ABC",500,2);
			
			if ( selected == null ) {
				
				System.out.println("Enter a valid value \"1\" OR \"2\".");
			}
			else {
				loopControl = 1;
				rentAmount = selected.calulateRent();
				System.out.println(rentAmount);
//				myStore.printDetails(selected);
				System.out.println("Enter no. of days item is rented : ");
				days = sc.nextInt();
				rentAmount = rentAmount * days;
				System.out.println(rentAmount);
			}
			
			
		}while(loopControl == 0);
	}

}
