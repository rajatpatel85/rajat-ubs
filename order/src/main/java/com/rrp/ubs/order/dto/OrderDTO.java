package com.rrp.ubs.order.dto;

import java.io.Serializable;
import java.util.Date;

public class OrderDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int orderId;

	private String orderCode;

	private String orderDescription;

	private Date orderCreateDate;

	private String orderNotes;

	private String orderStatus;

	private Date orderUpdateDate;

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
