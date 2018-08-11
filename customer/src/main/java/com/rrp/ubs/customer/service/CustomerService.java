package com.rrp.ubs.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rrp.ubs.customer.repository.CustomerRepository;
import com.rrp.ubs.customer.dao.CustomerEntity;

@Component
public class CustomerService {

	@Autowired
	CustomerRepository repository;

	public int addCustomer(CustomerEntity customerEntity) {
		repository.save(customerEntity);
		return customerEntity.getCustomerId();
	}

	public List<CustomerEntity> findAllCutomer() {
		return repository.findAll();
	}
	
	public void deleteCustomer(Integer customerId) {
		 repository.deleteById(customerId);
	}


}
