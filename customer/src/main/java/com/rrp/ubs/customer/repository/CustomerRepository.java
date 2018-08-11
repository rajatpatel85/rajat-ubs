package com.rrp.ubs.customer.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rrp.ubs.customer.dao.CustomerEntity;

public interface CustomerRepository extends CrudRepository<CustomerEntity, Integer>{
	
	@Override
	List<CustomerEntity> findAll();
	
}