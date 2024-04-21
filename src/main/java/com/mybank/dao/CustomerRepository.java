package com.mybank.dao;

import java.util.List;

import com.mybank.model.Customer;

public interface CustomerRepository {
	List<Customer> findByFirstName(String firstName);
	List<Customer> findByLastName(String lastName);
	List<Customer> getAllCustomers();
}
