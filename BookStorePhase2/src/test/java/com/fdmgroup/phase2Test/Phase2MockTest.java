package com.fdmgroup.phase2Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import com.fdmgroup.bookstore.data.UserRepository;

import com.fdmgroup.bookstore.data.UserRepositoryImpl2;
import com.fdmgroup.bookstore.model.Book;
import com.fdmgroup.bookstore.model.User;
import com.fdmgroup.bookstore.service.AuthenticationService;
import com.fdmgroup.bookstore.service.BookService;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Phase2MockTest {
    
	@Mock
	UserRepository mockUserRepository;
	
	AuthenticationService authenticationService;
	
	@BeforeEach
	void setUp() throws Exception{
	  userRepository= new AuthenticationService(mockUserRepository);
		
		
		
	}
		
		
	
		
	}
	
	@Test 
	public void findByIdTest() {
		UserRepositoryImpl2 userRepository = mock(UserRepositoryImpl2.class);
		when(userRepository.findById(1)).thenThrow(new RuntimeException("UserNotFoundException"));
		assertThrows(RuntimeException.class,()->userRepository.findById(1));
		
		
	}	
	
	@Test
	public void getAllBooksTest() {
		
	}
	

	@Test
	public void getBooksOfGenreTest() {
		BookService bookservice = mock(BookService.class);
		List<String> b = Arrays.asList("Novel","Drama")
	    when(bookservice.getBooksOfGenre()),thenReturn(b);
	   
		
	    
	    
		
		
	}
	
	
	
	
	
	
}
