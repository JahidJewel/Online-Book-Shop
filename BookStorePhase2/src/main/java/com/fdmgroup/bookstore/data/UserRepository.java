package com.fdmgroup.bookstore.data;

import com.fdmgroup.bookstore.model.User;

public interface UserRepository extends Searchable{
	boolean validate(String username, String password) throws UserNotFoundException;
	
	User findByUsername(String username);

	
	
	


}


