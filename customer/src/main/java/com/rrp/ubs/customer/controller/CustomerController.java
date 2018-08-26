package com.rrp.ubs.customer.controller;

import java.text.ParseException;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rrp.ubs.customer.dao.CustomerEntity;
import com.rrp.ubs.customer.dto.CustomerDTO;
import com.rrp.ubs.customer.service.CustomerService;
import com.rrp.ubs.customer.util.CustomerUtil;
@CrossOrigin
@RestController
@RequestMapping("v1/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;

	// request mapping is used for routing the request from client/browser.
	@GetMapping
	public List<CustomerDTO> findAllCutomer() {
		List<CustomerEntity> customerEntityList = customerService.findAllCutomer();
		return customerEntityList.stream().map(customerEntity -> CustomerUtil.convertToDTO(customerEntity))
				.collect(Collectors.toList());
	}
	
//	@GetMapping("/{customerId}")
//	public int updateCustomer(@RequestBody String inputCustomerData) {
//		int customerId = 0;
//		return customerId;
//	}

	// to add the customer
	@PostMapping("/addCustomer")
	public int addCustomer(@RequestBody CustomerDTO customerDTO) throws ParseException {
		int customerId = customerService.addCustomer(CustomerUtil.convertToEntity(customerDTO));
		return customerId;
	}

	@PutMapping("/{customerId}")
	public int updateCustomer(@RequestBody String inputCustomerData) {
		int customerId = 0;
		return customerId;
	}

	@DeleteMapping("/{customerId}")
	public void deleteCustomer(@PathVariable Integer customerId) {
		customerService.deleteCustomer(customerId);
	}

}
