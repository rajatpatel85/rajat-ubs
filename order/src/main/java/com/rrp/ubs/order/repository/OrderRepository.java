package com.rrp.ubs.order.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rrp.ubs.order.dao.OrderEntity;

public interface OrderRepository extends CrudRepository<OrderEntity, Integer>{
	
	@Override
	List<OrderEntity> findAll();
	
}