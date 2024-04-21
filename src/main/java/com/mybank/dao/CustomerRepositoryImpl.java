package com.mybank.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import com.mybank.model.Customer;

@Component
public class CustomerRepositoryImpl implements CustomerRepository {

	@Autowired
	MongoTemplate mongoTemplate;

	public List<Customer> findByFirstName(String firstName) {
		Query query = new Query(Criteria.where("firstName").is(firstName));
		List<Customer> listUser = mongoTemplate.find(query, Customer.class);
		return listUser;
	}

	public List<Customer> findByLastName(String lastName) {
		Query query = new Query(Criteria.where("lastName").is(lastName));
		List<Customer> listUser = mongoTemplate.find(query, Customer.class);
		return listUser;

	}

	@Override
	public List<Customer> getAllCustomers() {
		return mongoTemplate.findAll(Customer.class);
	}
}
