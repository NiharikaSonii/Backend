package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojo.Manufacturer;
@Repository
public interface ManufacturerRepo extends JpaRepository<Manufacturer, Integer> {

}
