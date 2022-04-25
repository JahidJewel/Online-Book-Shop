package com.fdmgroup.bookstore.service;

import java.util.ArrayList;
import java.util.List;

import com.fdmgroup.bookstore.data.BookRepository;
import com.fdmgroup.bookstore.model.Book;
import com.fdmgroup.bookstore.model.BookGenre;
import com.fdmgroup.bookstore.model.User;

public class BookService {
	
	private BookRepository bookRepository;
	static ArrayList<Book> books =new ArrayList<>();

	public BookService() {
		super();
		
		
	}

	public BookService(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}

	public BookRepository getBookRepository() {
		return bookRepository;
	}

	public void setBookRepository(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	
	List<Book> getAllBooks(){
		return null;
		
	}
	
	
	List<Book> getBooksOfGenre(BookGenre bookGenre){
		List<Book> bookListMatchingGenre = new ArrayList();
		
		for (Book book:books) {
			if(book.getBookGenre()== bookGenre) {
				// return books;
				bookListMatchingGenre.add(book);
			}			
		}
		//return null;
		
		if(bookListMatchingGenre.size()>0) {
			return bookListMatchingGenre;
		}
		else {
			return null;
		}
		
		
	}
	
	List<Book> searchBookByTitle(String title){
		return null;
		
	}
	
	List<Book> searchBookByAuthorName(String bookAuthorNameToSearch){
		return null;
		
	}
	

}
