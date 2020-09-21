package com.training.second;

import com.training.exceptions.MyCustomException;
import com.training.exceptions.RangeCheckException;

public class Book {

	private int bookId;
	private String bookName;
	private String author;
	private int price;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int bookId, String bookName, String author, int price)  throws RangeCheckException, MyCustomException{
		super();
		this.bookId = bookId;
		try {
			if (bookName == null) {
				throw new NullPointerException();
			}
			
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			throw new MyCustomException("Enter a valid book name", e);
//			e.printStackTrace();
		}
		this.bookName = bookName;
		this.author = author;
		if (price < 100 || price > 500) {
			throw new RangeCheckException("Book Price should be between 100 and 500");
		}
		this.price = price;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) throws MyCustomException{
		
		try {
			if (bookName == null) {
				throw new NullPointerException();
			}
			
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			throw new MyCustomException("Enter a valid book name", e);
//			e.printStackTrace();
		}
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price){
		
		try {
			if (price < 100 || price > 500) {
				throw new RangeCheckException("Book Price should be between 100 and 500");
			}
		} catch (RangeCheckException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
//			e.printStackTrace();
		}
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", price=" + price + "]";
	}
	
	
}
