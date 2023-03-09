package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.pojo.Manufacturer;
import com.app.repo.ManufacturerRepo;

@Service
public class ManufacturerService {

	@Autowired
	private ManufacturerRepo manufacturerRepo;

	public void add(Manufacturer manufacturer) {
		manufacturerRepo.save(manufacturer);
		
	}
	
	
}
