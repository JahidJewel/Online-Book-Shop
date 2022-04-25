package com.fdmgroup.bookstore.data;

import java.util.ArrayList;

import java.util.List;
import com.fdmgroup.bookstore.data.UserNotFoundException;

import com.fdmgroup.bookstore.model.User;

public class UserRepositoryImpl2 implements UserRepository {

	static ArrayList<User> userList = new ArrayList<>();
	@Override
	public boolean validate(String username, String password) throws UserNotFoundException {
        boolean result =false;
		for (User user : userList) {
			if (user.getUsername() == username && user.getPassword() == password) {
				result = true;
			} else {
				throw new UserNotFoundException("the user does not exist" + user);
			}
		}
		return result;
		

	}

	@Override
	public User findByUsername(String username) {
		for (User users : userList) {
			if (users.getUsername() == username)
				return users;

		}
		return null;
	}

	@Override
	public List findAll() {
		List<User> filteredUsers = new ArrayList<>();
		List<User> users = UserRepository.getAllUsers();
		for (User user : userList) {
			if (users.equals(userList)) {
				filteredUsers.add(user);

			}

		}

		return filteredUsers;
	}

	@Override
	public <T> T findById(int id) throws UserNotFoundException {
		for (User userId : userList) {
			if (userId.getUserId() == id)
				return (T) userId;
			else {
				throw new UserNotFoundException("the user does not exist" + userId);

			}
		}
		return null;

	}

}
