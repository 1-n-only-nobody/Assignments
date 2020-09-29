package com.training.second;

import java.util.NoSuchElementException;
import java.util.Scanner;

import com.training.exceptions.MyCustomException;
import com.training.exceptions.RangeCheckException;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookService bkserv = new BookService();
		int len = 0;
		int key = 0;
		Book[] bkarr = new Book[20];
		Book extrabk = new Book();
		Book newbk1;
		
		System.out.println("Enter no. of books you want to add : (atleast 1 and less than 20)");
//		Scanner sc = new Scanner(System.in);
		
//		len = sc.nextInt();
		
//		System.out.println("Enter book details: (ID Name author price)");
		Book newbk = new Book();
		newbk.setBookId(123);
		newbk.setAuthor("Cde");
		newbk.setPrice(450);
		try {
			newbk.setBookName(null);
		} catch (MyCustomException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}
		
		
		try {
			newbk1 = new Book(456, "Abc", "Cde", 11111);
		} catch (RangeCheckException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
//			e1.printStackTrace();
		} catch (MyCustomException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
//			e1.printStackTrace();
		}
		
//		System.out.println("Enter book details: (ID Name author price)");
		
		
		Book newbk2 = new Book();
		newbk2.setBookId(234);
		newbk2.setAuthor("Cde");
		newbk2.setPrice(450);
		try {
			newbk2.setBookName("XYZ");
		} catch (MyCustomException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
//			e1.printStackTrace();
		}
//		System.out.println("Enter the number of the book you want: ");
		key = 484;
		
		bkserv.addBook(newbk);
		bkserv.addBook(newbk2);
		bkserv.addBook(newbk2);
		
		try {
			extrabk = bkserv.getOne(key);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("enter a valid key.");
//			e.printStackTrace();
		}
		
		System.out.println("Saving all books.");
		
		bkarr = bkserv.getAll();
	}

}
