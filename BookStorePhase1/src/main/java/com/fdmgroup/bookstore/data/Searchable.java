package com.fdmgroup.bookstore.data;

import java.util.List;

import com.fdmgroup.bookstore.model.User;

public interface Searchable {
	
	User findById(int id);
	
	List<User>findAll();

}

/*
 * 	  User findById(Id id) {
		
			for (User userId : userid) {
				if(userId.getUserId() == id)
	            return id;
			}
			return null;
		
	}
	
 * 
 * 
 * 
 */
