package com.fdmgroup.bookstore.data;

import java.util.List;

import com.fdmgroup.bookstore.model.User;

public interface UserRepository extends Searchable, Persistable, Removable {
	
	
	
	boolean validate(String username, String password);
	User findByUsername(String username);
	List<User> getAllUsers();
	
	
	/*
	  default boolean validate(String username, String password) {
		
		for (User users : user) {
			if(users.getUsername() == username && users.getPassword()== password)
            return true;
		}
		return false;
		
	}
	
	 findByUsername(String username) {
		
		for (User users : user) {
			if(users.getUsername() == username)
            return users;
		}
		return null;
		

		
	}
	*/
	
	
	

}
