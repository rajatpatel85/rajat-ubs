package com.rrp.ubs.customer.dto;

public class Address {
	
	private String house;
	private String street;
	private String city;
	private String state;
	private String landMark;
	private String postOffice;
	private int pincode;
	private String miscInformation;
	
	
	public String getHouse() {
		return house;
	}
	public void setHouse(String house) {
		this.house = house;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	public String getPostOffice() {
		return postOffice;
	}
	public void setPostOffice(String postOffice) {
		this.postOffice = postOffice;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getMiscInformation() {
		return miscInformation;
	}
	public void setMiscInformation(String miscInformation) {
		this.miscInformation = miscInformation;
	}
	
}
