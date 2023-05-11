package com.ahia.ecommerceProject.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;

	//CREATE A CUSTOMER CONTROLLER METHOD
	@RequestMapping(value="/customers", method = RequestMethod.POST)
	public Customer createCustomer(@RequestBody Customer customer) {
		return customerService.createCustomer(customer);
	}

	//GET/GET ALL CUSTOMERS CONTROLLER METHOD
	@RequestMapping(value = "/customers", method = RequestMethod.GET)
	public List<Customer> readCustomers() {
		return customerService.getCustomer();
	}

	//UPDATE CUSTOMER CONTROLLER METHOD
	@RequestMapping(value="/customer/{cust_id}", method = RequestMethod.PUT)
	public Customer updateCustomer(@PathVariable(value = "cust_id") Long id, @RequestBody Customer customerDetails) {
		return customerService.updateCustomer(id, customerDetails);
	}

	//DELETE A CUSTOMER CONTROLLER METHOD
	@RequestMapping(value = "/customer/{cust_id}", method = RequestMethod.DELETE)
	public void deleteCustomer( @PathVariable(value = "cust_id") Long id) {
		customerService.deleteCustomer(id);
	}

}
