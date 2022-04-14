package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Customer;
import com.example.demo.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository crepo;

	public Customer add(Customer c)
	{
		return crepo.save(c);
	}
	
	public Customer GetCustomer(int CustomerID)
	{
		return crepo.findById(CustomerID).get();
	}
	
}
