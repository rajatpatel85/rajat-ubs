package com.rrp.ubs.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rrp.ubs.order.dao.OrderEntity;
import com.rrp.ubs.order.repository.OrderRepository;

@Component
public class OrderService {

	@Autowired
	OrderRepository repository;

	public int addOrder(OrderEntity orderEntity) {
		repository.save(orderEntity);
		return orderEntity.getOrderId();
	}

	public List<OrderEntity> findAllOrders() {
		return repository.findAll();
	}
	
	public void deleteOrder(Integer orderId) {
		 repository.deleteById(orderId);
	}


}
