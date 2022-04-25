package com.fdmgroup.bookstore.service;

import java.util.List;

import com.fdmgroup.bookstore.data.OrderRepository;
import com.fdmgroup.bookstore.model.Book;
import com.fdmgroup.bookstore.model.Order;
import com.fdmgroup.bookstore.model.User;

public class OrderingService {
	
	private OrderRepository orderRepository;

	public OrderingService() {
		super();
		
	}

	public OrderingService(OrderRepository orderRepository) {
		super();
		this.orderRepository = orderRepository;
	}


	public OrderRepository getOrderRepository() {
		return orderRepository;
	}

	public void setOrderRepository(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}
	
	
	Order placeOrder(Book book, User customer) {
		return null;
		
	}
	
	List<Order> placeOrders(List<Book>books, User customer){
		return null;
		
	}
	
	List<Order> getOrderForUser(User user){
		return null;
		
	}
	
	List<Order> getOrderForBook(Book book){
		return null;
		
	}
	
	
	

}
