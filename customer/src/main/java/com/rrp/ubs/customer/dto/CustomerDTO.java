package com.rrp.ubs.customer.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

public class CustomerDTO implements Serializable {

	private int customerId;

	private String customerFirstName;

	private String customerLastName;

	private Long workNumber;

	private Long homeNumber;

	private Long mobileNumber;

	private Date registeredDate;

	private Date unregisteredDate;

	private boolean status;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	
	public Long getWorkNumber() {
		return workNumber;
	}

	public void setWorkNumber(Long workNumber) {
		this.workNumber = workNumber;
	}

	public Long getHomeNumber() {
		return homeNumber;
	}

	public void setHomeNumber(Long homeNumber) {
		this.homeNumber = homeNumber;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Date getRegisteredDate() {
		return registeredDate;
	}

	public void setRegisteredDate(Date registeredDate) {
		this.registeredDate = registeredDate;
	}

	public Date getUnregisteredDate() {
		return unregisteredDate;
	}

	public void setUnregisteredDate(Date unregisteredDate) {
		this.unregisteredDate = unregisteredDate;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}


}
