package com.training.first;

import java.io.File;

import com.training.model.Book;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book headFirst = new Book(100,"Head First Java", "Kathy Sierra", 450);
//		
		BookService service = new BookService();
//		
//		boolean result = service.writeObject(headFirst);
//		
//		if(result) {
//			System.out.println("Book Persisted");
//		} else {
//			System.out.println("Error - Check");
//		}
		
		Book newHeadFirst = null;
		
//		Book newHeadFirst = service.readObject();
		
//		System.out.println(newHeadFirst);
		
		File file = new File("book1.txt");
		
//		service.writeWithDataStream(headFirst, file);
		
		newHeadFirst = service.readWithDataStream(file);
		
		System.out.println(newHeadFirst);
	}

}
