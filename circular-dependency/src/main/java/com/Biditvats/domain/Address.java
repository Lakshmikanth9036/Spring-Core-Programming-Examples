package com.Biditvats.domain;

public class Address {
	private long id;
	private String houseNo;
	private String street;
	private String city;
	private String landmark;
	private String state;
	private long zipcode;
	private Customer customer;
	
	public Address(long id, String houseNo, String street, String city, String landmark, String state, long zipcode,
			Customer customer) {
		super();
		this.id = id;
		this.houseNo = houseNo;
		this.street = street;
		this.city = city;
		this.landmark = landmark;
		this.state = state;
		this.zipcode = zipcode;
		this.customer = customer;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Address ID:" +id
				+"\nHouse No: " +houseNo
				+"\nStreet: " +street
				+"\nCity: " +city
				+"\nLandmark: " +landmark
				+"\nState: " +state
				+"\nZipcode: " +zipcode;
	}
	
}
