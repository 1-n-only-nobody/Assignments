package com.training.second;

import java.util.NoSuchElementException;

public class BookService {

	Book []bk = new Book[3];
	int i = 0;
	
	public void addBook(Book newBook) {
		if (i < 3) {
			bk[i] = newBook;
			i++;
		}
	}
	
	public Book getOne(int key) throws NoSuchElementException{
		
		for (int j = 0; j < i; j++) {
			if(bk[j].getBookId() == key) {
				return bk[j];
			}
		}
		throw new NoSuchElementException();
	}
	
	public Book[] getAll() {
		
		return bk;
	}
}
