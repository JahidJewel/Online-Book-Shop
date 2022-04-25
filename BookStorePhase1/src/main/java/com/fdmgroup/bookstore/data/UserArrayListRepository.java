package com.fdmgroup.bookstore.data;

import java.util.List;

import com.fdmgroup.bookstore.model.User;

public abstract class UserArrayListRepository implements UserRepository {
	
	private List<User>users;
	
	public static int id  = 1;
	
	
	UserArrayListRepository() {
		
	}
	
   
   public UserArrayListRepository(List<User>users) {
		super();
		this.users = users;
	}

    
   
   public static int generateID() {
		return id;
		   
	   }
   

	@Override
    public String toString() {
	return "UserArrayListRepository [users=" + users + "]";
    }
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((users == null) ? 0 : users.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserArrayListRepository other = (UserArrayListRepository) obj;
		if (users == null) {
			if (other.users != null)
				return false;
		} else if (!users.equals(other.users))
			return false;
		return true;
	}




	public List<User> getUsers() {
	return users;
   }




	public void setUsers(List<User> users) {
		this.users = users;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		UserArrayListRepository.id = id;
	}




	
	
	

   
	
	
	

}

