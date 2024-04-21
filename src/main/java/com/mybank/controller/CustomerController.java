package com.mybank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mybank.model.Customer;
import com.mybank.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService service;

	@GetMapping("/users/{lastName}")
	List<Customer> getCustomerByLastName(@PathVariable String lastName) {
		return service.getCustomerByLastName(lastName);
	}
	
	@GetMapping("/users/{firstName}")
	List<Customer> getCustomerByFirstName(@PathVariable String firstName) {
		return service.getCustomerByFirstName(firstName);
	}

	@GetMapping("/users")
	List<Customer> getAllCustomers() {
		return service.getAllCustomers();
	}

}
