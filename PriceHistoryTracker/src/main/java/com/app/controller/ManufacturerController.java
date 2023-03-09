package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojo.Manufacturer;
import com.app.service.ManufacturerService;

@RestController
@RequestMapping("Manufacturer")
@CrossOrigin
public class ManufacturerController {

	@Autowired
	private ManufacturerService manufacturerService;
	
	@PostMapping("/addManufacturer")
	public void addManufacturer(@RequestBody Manufacturer manufacturer) {
		manufacturerService.add(manufacturer);
	}
}
