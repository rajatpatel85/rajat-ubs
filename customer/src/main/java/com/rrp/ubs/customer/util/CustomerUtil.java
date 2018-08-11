package com.rrp.ubs.customer.util;

import java.text.ParseException;
import java.util.Date;

import org.modelmapper.ModelMapper;

import com.rrp.ubs.customer.dao.CustomerEntity;
import com.rrp.ubs.customer.dto.CustomerDTO;

public class CustomerUtil {

	public static CustomerEntity convertToEntity(CustomerDTO customerDTO)
			throws ParseException {		
		ModelMapper modelMapper = new ModelMapper();
		CustomerEntity customerEntity = modelMapper.map(customerDTO, CustomerEntity.class);
		customerEntity.setRegisteredDate(new Date());
		customerEntity.setUnregisteredDate(new Date());
		customerEntity.setStatus(true);
		return customerEntity;
	}
	
	public static CustomerDTO convertToDTO (CustomerEntity customerEntity) {
		
		ModelMapper modelMapper = new ModelMapper();
		CustomerDTO customerDTO = modelMapper.map(customerEntity, CustomerDTO.class);
		return customerDTO;
		
	}
	
}
