package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Category;
import com.example.demo.service.CategoryService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class CategoryController {
	
	@Autowired
	CategoryService catservice;

	@PostMapping("/addcategory")
	public Category add(Category ct)
	{
		return catservice.add(ct);
	}
	
	@GetMapping("/getAllCat")
	public List<Category> getAllCat()
	{
		return catservice.getAllCat();
	}
}
