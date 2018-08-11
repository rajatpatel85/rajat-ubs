package com.rrp.ubs.customer.dao;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "CUSTOMER")
public class CustomerEntity implements Serializable {
	
	private static final long serialVersionUID = -3009157732242241606L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	
	@Column(name = "FIRST_NAME")
	private String customerFirstName;
	
	@Column(name = "LAST_NAME")
	private String customerLastName;
	
	@Column(name = "WORK_NUMBER")
	private Long workNumber;
	
	@Column(name = "HOME_NUMBER")
	private Long homeNumber;
	
	@Column(name = "MOBILE_NUMBER")
	private Long mobileNumber;
	
	@Column(name = "REGISTERED_DATE")
	private Date registeredDate;
	
	@Column(name = "UNREGISTERED_DATE")
	private Date unregisteredDate;
	
	@Column(name = "STATUS")
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}
