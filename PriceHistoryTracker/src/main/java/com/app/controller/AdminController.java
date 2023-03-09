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
import com.app.service.AdminService;

@RestController
@RequestMapping("Admin")
@CrossOrigin
public class AdminController {
	@Autowired
	private AdminService adminService;
	
	@PostMapping("/auth")
	public ResponseEntity<?> auth(@RequestBody Admin admin) {
		List<Admin> admins=adminService.getAllDetails();
		boolean authentication=false;
		for (Iterator iterator = admins.iterator(); iterator.hasNext();) {
			Admin a = (Admin) iterator.next();
			if(a.getEmail().equals(admin.getEmail())) {
				if(a.getPassword().equals(admin.getPassword())) {
					authentication=true;
				}
			}
			
		}
		System.out.println(authentication);
		return ResponseEntity.ok(admin);
	}
	

}
