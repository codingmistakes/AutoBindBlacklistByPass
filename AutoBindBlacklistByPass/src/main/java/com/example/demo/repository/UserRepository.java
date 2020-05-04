package com.example.demo.repository;

import com.example.demo.model.*;

public class UserRepository {

	public User FetchCurrent()
	{
		User user = new User();
		user.setFirstname("John");
		user.setLastname("Doe");
		user.setEmail("john.doe@example.com");
		user.setBio("Baseball enthusiast, book worm & diligent coder");
		return user;
	}
	
	public void Update(User user)
	{
		// update the user to the database
	}
}
