package com.fdmgroup.bookstore.model;

import java.time.LocalDateTime;

public class Order {
	private int orderID;
	private Book bookOrdered;
	private User user;
	private LocalDateTime orderDateTiem;
	
	
	public Order() {
		super();
		
	}


	public Order(int orderID, Book bookOrdered, User user, LocalDateTime orderDateTiem) {
		super();
		this.orderID = orderID;
		this.bookOrdered = bookOrdered;
		this.user = user;
		this.orderDateTiem = orderDateTiem;
	}


	public int getOrderID() {
		return orderID;
	}


	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}


	public Book getBookOrdered() {
		return bookOrdered;
	}


	public void setBookOrdered(Book bookOrdered) {
		this.bookOrdered = bookOrdered;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public LocalDateTime getOrderDateTiem() {
		return orderDateTiem;
	}


	public void setOrderDateTiem(LocalDateTime orderDateTiem) {
		this.orderDateTiem = orderDateTiem;
	}
	
	
	
	

}
