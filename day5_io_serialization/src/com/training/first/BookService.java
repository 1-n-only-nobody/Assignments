package com.training.first;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.training.model.book.Book;

public class BookService {

	public boolean writeObject(Book book) {
		
		boolean persisted = false;
		
		ObjectOutputStream outStream = null;
		
		try {
			
			outStream = new ObjectOutputStream(new FileOutputStream(new File("book.ser")));
			
			outStream.writeObject(book);
			
			persisted = true;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				
				outStream.close();
				
			} catch (IOException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
		return persisted;
	}
	
	public Book readObject() {
		
		Book book = null;
		
		return book;
	}
}
