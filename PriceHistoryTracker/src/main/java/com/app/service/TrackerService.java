package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.repo.TrackerRepo;
import com.app.repo.UserRepo;

@Service
public class TrackerService {

	@Autowired
	private TrackerRepo trackerRepo;
}
