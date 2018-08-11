package com.rrp.ubs.order.util;

import java.text.ParseException;
import java.util.Date;

import org.modelmapper.ModelMapper;


import com.rrp.ubs.order.dao.OrderEntity;
import com.rrp.ubs.order.dto.OrderDTO;

public class OrderUtil {

	public static OrderEntity convertToEntity(OrderDTO customerDTO)
			throws ParseException {		
		ModelMapper modelMapper = new ModelMapper();
		OrderEntity orderEntity = modelMapper.map(customerDTO, OrderEntity.class);
		orderEntity.setOrderCreateDate(new Date());
		return orderEntity;
	}
	
	public static OrderDTO convertToDTO (OrderEntity customerEntity) {
		
		ModelMapper modelMapper = new ModelMapper();
		OrderDTO orderDTO = modelMapper.map(customerEntity, OrderDTO.class);
		return orderDTO;
		
	}
	
}
