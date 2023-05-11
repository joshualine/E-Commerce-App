package com.ahia.ecommerceProject.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	//CREATE
	public Customer createCustomer(Customer customer) {
		return customerRepository.save(customer);
	}
}
