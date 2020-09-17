package com.training.third;

import java.util.Scanner;

import com.training.ifaces.Rentable;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int loopControl = 0;
		int iterator = 0;
		double rentAmount[] = new double[20];
		int days;
		int quantity;
		double rentAmountFinal = 0;
		int exit = 1;
		
		
		Store myStore = new Store();
		
		Scanner sc = new Scanner(System.in);
		int key;
		do {
			System.out.println("Enter key of Product you want  1 --> Computer  and 2 --> Furniture: ");
			key = sc.nextInt();
			System.out.println("Enter quantity of product : ");
			quantity = sc.nextInt();
			Rentable selected = myStore.getProduct(key,"Model1","C1",500,quantity);
			
			if ( selected == null ) {
				
				System.out.println("Enter a valid key value \"1\" OR \"2\".");
			}
			else {
				loopControl = 1;
				rentAmount[iterator] = selected.calulateRent();
				System.out.println(rentAmount[iterator]);
//				myStore.printDetails(selected);
				System.out.println("Enter no. of days item is rented : ");
				days = sc.nextInt();
				rentAmount[iterator] = rentAmount[iterator] * days;
				iterator++;
				System.out.println("If you want to quit press : 0");
				exit = sc.nextInt();
				if ( exit == 0 ) {
					break;
				}
//				System.out.println(rentAmount);
			}
			
			
		}while(iterator != 20 || loopControl == 0);
		
		for (double d : rentAmount) {
			rentAmountFinal += d;
		}
		System.out.println(rentAmountFinal);
	}

}
