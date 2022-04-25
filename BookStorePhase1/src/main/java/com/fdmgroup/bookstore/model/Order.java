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


	
	
	
	
	@Override
	public String toString() {
		return "Order [orderID=" + orderID + ", bookOrdered=" + bookOrdered + ", user=" + user + ", orderDateTiem="
				+ orderDateTiem + "]";
	}

	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookOrdered == null) ? 0 : bookOrdered.hashCode());
		result = prime * result + ((orderDateTiem == null) ? 0 : orderDateTiem.hashCode());
		result = prime * result + orderID;
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (bookOrdered == null) {
			if (other.bookOrdered != null)
				return false;
		} else if (!bookOrdered.equals(other.bookOrdered))
			return false;
		if (orderDateTiem == null) {
			if (other.orderDateTiem != null)
				return false;
		} else if (!orderDateTiem.equals(other.orderDateTiem))
			return false;
		if (orderID != other.orderID)
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
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
