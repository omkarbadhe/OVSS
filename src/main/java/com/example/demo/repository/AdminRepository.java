package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Admin;

@Repository
@EnableJpaRepositories
public interface AdminRepository extends JpaRepository<Admin, Integer> {
  
	
}
