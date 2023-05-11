package com.ahia.ecommerceProject.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	//CREATE
	public Customer createCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	//READ
	public List<Customer> getCustomer() {
		return customerRepository.findAll();
	}

	//DELETE
	public void deleteCustomer(Long cust_id) {
		customerRepository.deleteById(cust_id);
	}

	//UPDATE
	public Customer updateCustomer(Long cust_id, Customer customerDetails) {
		Customer customer = customerRepository.findById(cust_id).get();
		customer.setFirstName(customerDetails.getFirstName());
		customer.setLastName(customerDetails.getLastName());
		customer.setEmailId(customerDetails.getEmailId());

		return customerRepository.save(customer);
	}
}