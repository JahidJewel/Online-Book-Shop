package com.fdmgroup.bookstore.data;

import java.util.List;

public interface Searchable {
	
	<T> T findById(int id) throws UserNotFoundException;

    <T> List<T> findAll();

}
