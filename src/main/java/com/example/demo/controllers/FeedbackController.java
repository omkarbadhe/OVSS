package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Customer;
import com.example.demo.entities.Feedback;
import com.example.demo.entities.FeedbackAdd;
import com.example.demo.entities.Owner;
import com.example.demo.service.CustomerService;
import com.example.demo.service.FeedbackService;
import com.example.demo.service.OwnerService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class FeedbackController {
  
	
	@Autowired
	FeedbackService fservice;
	
	@Autowired
	CustomerService cservice;
	
	@Autowired
	OwnerService oservice;
	
	
	@PostMapping("/addfeedback")
	public Feedback addfeedback1(@RequestBody FeedbackAdd fd)
	{   
		    Customer c = cservice.GetCustomer(fd.getCustomer());  
		    Owner o = oservice.getOwner(fd.getOwner());
		    Feedback f = new Feedback(fd.getFeedback_text(),fd.getCreatedOn(),c,o);
		  return  fservice.add(f);
	}
	
	@GetMapping("/getfeedback/{oid}")
	public List<Feedback> getFeedback(@PathVariable("oid") int oid)
	{
		return fservice.getFeedback(oid);
	}
	@GetMapping("/getfeedbacks")
	public List<Feedback> getFeedbacks()
	{
		return fservice.getFeedbacks();
	}
}
