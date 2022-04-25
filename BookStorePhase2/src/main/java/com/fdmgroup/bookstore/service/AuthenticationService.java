package com.fdmgroup.bookstore.service;

import com.fdmgroup.bookstore.data.UserNotFoundException;
import com.fdmgroup.bookstore.data.UserRepository;
import com.fdmgroup.bookstore.model.User;

public class AuthenticationService {
	
	private UserRepository  userRepository;

	public AuthenticationService() {
		super();
		
	}
	public AuthenticationService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	





	public UserRepository getUserRepository() {
		return userRepository;
	}

	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "AutheticationService [userRepository=" + userRepository + "]";
	}



	User authenticate(String username, String password) throws UserNotFoundException {
		 boolean validate = userRepository.validate(username, password);
		 if(validate) {
			 return userRepository.findByUsername(username);
		 }
		return null;
		
	}
	
	
	
	
	
	
	

}
