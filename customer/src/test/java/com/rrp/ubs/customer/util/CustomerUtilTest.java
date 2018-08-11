package com.rrp.ubs.customer.util;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.rrp.ubs.customer.dao.CustomerEntity;
import com.rrp.ubs.customer.dto.CustomerDTO;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CustomerUtil.class)
public class CustomerUtilTest {	
	
	private ModelMapper modelMapper = new ModelMapper();
	
	@Test
	public void convertToEntityTest() throws ParseException {
		
		CustomerDTO customerDTO = new CustomerDTO();
		customerDTO.setCustomerFirstName("TestName");
		customerDTO.setCustomerLastName("LastName");
		CustomerEntity customerEntity = CustomerUtil.convertToEntity(customerDTO);
		assertEquals(customerEntity.getCustomerFirstName(), customerDTO.getCustomerFirstName());
		assertEquals(customerEntity.getCustomerLastName(), customerDTO.getCustomerLastName());
		
	}
	
	@Test
	public void convertToDTOTest() throws ParseException {
		
		CustomerEntity customerEntity = new CustomerEntity();
		customerEntity.setCustomerFirstName("TestName");
		customerEntity.setCustomerLastName("LastName");
		CustomerDTO customerDTO = CustomerUtil.convertToDTO(customerEntity);
		assertEquals(customerEntity.getCustomerFirstName(), customerDTO.getCustomerFirstName());
		assertEquals(customerEntity.getCustomerLastName(), customerDTO.getCustomerLastName());
		
	}

}
