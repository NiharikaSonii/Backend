package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojo.Tracker;

@Repository
public interface TrackerRepo extends JpaRepository<Tracker, Integer>{

}
