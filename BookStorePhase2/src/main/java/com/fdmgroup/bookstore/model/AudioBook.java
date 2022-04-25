package com.fdmgroup.bookstore.model;

public class AudioBook extends Book {
	
	private int timeLengthSeconds;
	
	public AudioBook(int itemId, double price, String title, String author, BookGenre bookGenre) {
		super(itemId, price, title, author, bookGenre);
		
	}

	
	

}