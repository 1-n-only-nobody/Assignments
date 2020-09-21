package com.training.first;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.training.model.Book;

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
		
		ObjectInputStream inStream = null;
		
		try {
			inStream = new ObjectInputStream(new FileInputStream("book.ser"));
			
			book = (Book) inStream.readObject();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return book;
	}
	
	public boolean writeWithDataStream (Book book, File file) {
		
		DataOutputStream outStream = null;
		
		try {
			outStream = new DataOutputStream(new FileOutputStream(file));
			
			outStream.writeInt(book.getBookNumber());
			outStream.writeUTF(book.getBookName());
			outStream.writeUTF(book.getAuthor());
			outStream.writeDouble(book.getPrice());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return true;
	}
	
	public Book readWithDataStream (File file) {
		
		DataInputStream instream = null;
		
		Book book = new Book();
		
		try {
			instream = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
			
			book.setBookNumber(instream.readInt());
			book.setBookName(instream.readUTF());
			book.setAuthor(instream.readUTF());
			book.setPrice(instream.readDouble());

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return book;
	}
}
