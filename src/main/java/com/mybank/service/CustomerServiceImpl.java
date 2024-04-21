package com.mybank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybank.dao.CustomerRepository;
import com.mybank.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository repository;

	@Override
	public List<Customer> getCustomerByLastName(String lastName) {
		return repository.findByLastName(lastName);
	}

	@Override
	public List<Customer> getCustomerByFirstName(String firstName) {
		return repository.findByFirstName(firstName);
	}
	@Override
	public List<Customer> getAllCustomers() {
		return repository.getAllCustomers();
	}


}
