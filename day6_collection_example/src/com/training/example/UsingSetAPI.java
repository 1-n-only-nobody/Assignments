package com.training.example;

import java.util.HashSet;
import java.util.TreeSet;

import com.training.entity.Invoice;
import com.training.utils.AmountComparator;

public class UsingSetAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Invoice ram = new Invoice(101, "Ramesh", 4500);
		
		Invoice ram2 = new Invoice(101, "Ramesh", 4500);
		
		Invoice raj = new Invoice(102, "Rajesh", 7000);
		
		Invoice rak = new Invoice(103, "Rakesh", 9000);
		
		Invoice kam = new Invoice(104, "Kamlesh", 6500);
		
		HashSet<Invoice> hashExample = new HashSet<>();
		
		hashExample.add(kam);
		hashExample.add(rak);
		hashExample.add(raj);
		hashExample.add(ram);
		boolean isAdded = hashExample.add(ram2);
		
		System.out.println(isAdded);
		
		for (Invoice eachInvoice : hashExample) {
			System.out.println(eachInvoice);
		}
		
		TreeSet<Invoice> treeExample = new TreeSet<>(new AmountComparator());
		
		treeExample.add(kam);
		treeExample.add(rak);
		treeExample.add(raj);
		treeExample.add(ram);
		boolean isAddedToTree = hashExample.add(ram2);
		
		System.out.println(isAddedToTree);
		
		System.out.println("Natural Sorting with the Tree Set");
		for (Invoice eachInvoice : treeExample) {
			System.out.println(eachInvoice);
		}
	}

}
