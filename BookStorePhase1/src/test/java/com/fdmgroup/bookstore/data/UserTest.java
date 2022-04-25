package com.fdmgroup.bookstore.data;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.fdmgroup.bookstore.model.User;

import junit.framework.Assert;

class UserTest {

	

	@Test
	void test() {
		System.out.println(" passed");
	}
	
	
	@Test 
	public void validationTest() {
		
		UserRepositoryImpl userRepository = new UserRepositoryImpl();
		boolean result = userRepository.validate("Jahid", "Islam");
		assertEquals(false,result);
		
	}
	
	@Test
	public void findByUsernameTest() {
		
		UserRepositoryImpl userRepository = new UserRepositoryImpl();
		User result = userRepository.findByUsername("Jahidul");
		assertEquals(null,result);
		
		
	}
	
	@Test 
	public void userSaveTest() {
		User user1 = new User(1,"Jahidul", "Islam","FDMJahid",null,null,null);
		UserRepositoryImpl userRepository = new UserRepositoryImpl();
		User result = userRepository.save(user1);
		assertEquals(user1,result);
	
		
	}
	
	

	
	@Test 
	public void findByIdTest() {
		UserRepositoryImpl userRepository = new UserRepositoryImpl();
		User result = userRepository.findById(5);
		assertEquals(null,result);
		
	}
	
	@Test
	public void findByAllTest() {
		ArrayList<User> userList =new ArrayList<>();
		
		
		
		
		
		
		
	}
	
	@Test
	public void userDeleteTest() {
		
		UserRepositoryImpl userRepository = new UserRepositoryImpl();
		//boolean result = userRepository.delete(null);
	
		
	}
	
	
	
	

}
