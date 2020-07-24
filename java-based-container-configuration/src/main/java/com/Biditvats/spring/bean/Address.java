package com.Biditvats.spring.bean;

public class Address {
	private long addressId;
	private String houseNo;
	private String street;
	private String city;
	private String landmark;
	private String state;
	private long zipcode;
	
	public Address() {
		System.out.println("Address Object is created");
	}

	public Address(long addressId, String houseNo, String street, String city, String landmark, String state,
			long zipcode) {
		super();
		this.addressId = addressId;
		this.houseNo = houseNo;
		this.street = street;
		this.city = city;
		this.landmark = landmark;
		this.state = state;
		this.zipcode = zipcode;
	}

	public long getAddressId() {
		return addressId;
	}

	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
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

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getZipcode() {
		return zipcode;
	}

	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
	}
	
	

}
