package com.rrp.ubs.order.dao;

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
@Table(name = "order_detail")
public class OrderEntity implements Serializable {
	
	private static final long serialVersionUID = -3009157732242241606L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderId;
	
	@Column(name = "ORDER_CODE")
	private String orderCode;
	
	@Column(name = "ORDER_DESCRIPTION")
	private String orderDescription;
	
	@Column(name = "ORDER_CREATE_DATE")
	private Date orderCreateDate;
	
	@Column(name = "ORDER_NOTES")
	private String orderNotes;
	
	@Column(name = "ORDER_STATUS")
	private String orderStatus;
	
	@Column(name = "ORDER_UPDATE_DATE")
	private Date orderUpdateDate;
	
	@Column(name = "ORDER_UPDATE_USER_NAME")
	private String orderUpdateUserName;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getOrderDescription() {
		return orderDescription;
	}

	public void setOrderDescription(String orderDescription) {
		this.orderDescription = orderDescription;
	}

	public Date getOrderCreateDate() {
		return orderCreateDate;
	}

	public void setOrderCreateDate(Date orderCreateDate) {
		this.orderCreateDate = orderCreateDate;
	}

	public String getOrderNotes() {
		return orderNotes;
	}

	public void setOrderNotes(String orderNotes) {
		this.orderNotes = orderNotes;
	}

	public Date getOrderUpdateDate() {
		return orderUpdateDate;
	}

	public void setOrderUpdateDate(Date orderUpdateDate) {
		this.orderUpdateDate = orderUpdateDate;
	}

	public String getOrderUpdateUserName() {
		return orderUpdateUserName;
	}

	public void setOrderUpdateUserName(String orderUpdateUserName) {
		this.orderUpdateUserName = orderUpdateUserName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	
	

}
