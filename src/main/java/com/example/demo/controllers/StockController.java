package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Stock;
import com.example.demo.service.StockService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class StockController 
{
	@Autowired
	StockService stservice;
	@PostMapping("/addStock")
	public Stock AddStock(@RequestBody Stock ss)
	{
		
		return stservice.add(ss);
	}
	@GetMapping("/AllStock")
	public List<Stock> getStock()
	{
		return stservice.GetStock();
	}
	@PutMapping("/updatestock")
	public Stock updatestock(@RequestBody Stock s )
	{
		return stservice.add(s);
	}
}
