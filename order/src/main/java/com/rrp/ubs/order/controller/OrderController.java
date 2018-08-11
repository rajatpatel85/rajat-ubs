package com.rrp.ubs.order.controller;

import java.text.ParseException;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rrp.ubs.order.dao.OrderEntity;
import com.rrp.ubs.order.dto.OrderDTO;
import com.rrp.ubs.order.service.OrderService;
import com.rrp.ubs.order.util.OrderUtil;

@RestController
@RequestMapping("v1/order")
public class OrderController {

	@Autowired
	OrderService orderService;

	// request mapping is used for routing the request from client/browser.
	@GetMapping
	public List<OrderDTO> findAllOrders() {
		List<OrderEntity> orderEntityList = orderService.findAllOrders();
		return orderEntityList.stream().map(orderEntity -> OrderUtil.convertToDTO(orderEntity))
				.collect(Collectors.toList());
	}
	
//	@GetMapping("/{customerId}")
//	public int updateCustomer(@RequestBody String inputCustomerData) {
//		int customerId = 0;
//		return customerId;
//	}

	// to add the order
	@PostMapping("/addOrder")
	public int addOrder(@RequestBody OrderDTO orderDTO) throws ParseException {
		int orderId = orderService.addOrder(OrderUtil.convertToEntity(orderDTO));
		return orderId;
	}

	@PutMapping("/{orderId}")
	public int updateOrder(@RequestBody String inputOrderData) {
		int orderId = 0;
		return orderId;
	}

	@DeleteMapping("/{orderId}")
	public void deleteOrder(@PathVariable Integer orderId) {
		orderService.deleteOrder(orderId);
	}

}
