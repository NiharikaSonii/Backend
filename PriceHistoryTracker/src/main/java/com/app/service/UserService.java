package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.pojo.User;
import com.app.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;
	
	public void addUser(User user) {
		userRepo.save(user);
	}

	public List<User> getUserDetails() {
		
		return userRepo.findAll();
	}
}
