package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojo.Admin;
@Repository
public interface AdminRepo extends JpaRepository<Admin, Integer> {

}
