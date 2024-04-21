package com.mybank.service;

import java.util.List;

import com.mybank.model.Customer;

public interface CustomerService {

	List<Customer> getCustomerByLastName(String lastName);
	List<Customer> getCustomerByFirstName(String firstName);
	List<Customer> getAllCustomers();

}
