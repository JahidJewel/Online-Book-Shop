package com.fdmgroup.bookstore.data;

import java.util.ArrayList;
import java.util.List;

import com.fdmgroup.bookstore.model.User;

public class UserRepositoryImpl implements UserRepository {
     
	
	private UserRepository userRepository;
	
	
	public UserRepositoryImpl() {
		super();
		
	}

	public UserRepositoryImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}


	static ArrayList<User> userList =new ArrayList<>();
	
	


	@Override
	public boolean validate(String username, String password) {
		for (User users : userList) {
			if(users.getUsername() == username && users.getPassword()== password)
            return true;
		}
		return false;
	}

	@Override
	public User findByUsername(String username) {
		for (User users : userList) {
			if(users.getUsername() == username)
            return users;
		}
		return null;
	}
	
	
	
	@Override
	public User findById(int id) {
		for (User userId : userList) {
			if(userId.getUserId() == id)
            return userId;
		}
		return null;
	}
	
	
	@Override
	public User save(User user) {
		
	boolean result = userList.add(user);
	if(result) {
		return user;
	}
		
		return null;
	}
	
	
	
	@Override
	public void delete(User user) {
		
    boolean result = userList.remove(user);
    	
	}
	
	
	@Override
	public List<User> findAll() {
		List<User> filteredUsers = new ArrayList<>(); 
		List<User> users = userRepository.getAllUsers();
		for (User user:userList) {
			if(users.equals(userList)){
				filteredUsers.add(user);
				
			}
			
		}
		
		return filteredUsers;	
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}
	


	
	
	

}
