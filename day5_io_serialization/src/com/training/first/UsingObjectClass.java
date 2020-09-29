package com.training.first;

import com.training.model.Book;

public class UsingObjectClass {
	
	public static void main(String[] args) {
		
		Book headFirst1 = new Book(100,"Head First Java", "Kathy Sierra", 450);
		
		Book headFirst2 = new Book(100,"Head First Java", "Kathy Sierra", 450);
		
		System.out.println(headFirst1.equals(headFirst2));
		
		Book headFirst3 = headFirst2;
		
		System.out.println(headFirst2.equals(headFirst3));
	}

}
