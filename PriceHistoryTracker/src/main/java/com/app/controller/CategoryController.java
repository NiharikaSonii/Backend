package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojo.Category;
import com.app.service.CategoryService;

@RestController
@RequestMapping("category")
@CrossOrigin
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@PostMapping("/addcategory")
	public ResponseEntity<?> addcategory(@RequestBody Category category){
		categoryService.add(category);
		return ResponseEntity.ok(category);
		
	}
	
}
