package com.app.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojo.Admin;
import com.app.pojo.User;
import com.app.service.UserService;

@RestController
@RequestMapping("User")
@CrossOrigin
public class UserController {
	@Autowired
	private UserService userService; 
	

	@PostMapping("/register")
	public ResponseEntity<?> register(@RequestBody User user){
		userService.addUser(user);
		return ResponseEntity.ok(user);
	}
	@PostMapping("/auth")
	public ResponseEntity<?> auth(@RequestBody User user) {
		List<User> users=userService.getUserDetails();
		User a=null;
		boolean authentication=false;
		for (Iterator iterator = users.iterator(); iterator.hasNext();) {
			User u = (User) iterator.next();
			if(u.getEmail().equals(user.getEmail())) {
				if(u.getPassword().equals(user.getPassword())) {
					authentication=true;
					a=u;
				}
			}
			
		}
		System.out.println(authentication);
		return ResponseEntity.ok(a);
	}
	
	
}
