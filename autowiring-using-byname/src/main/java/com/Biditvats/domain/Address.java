package com.Biditvats.domain;

public class Address {
	private long id;
	private String houseNo;
	private String street;
	private String city;
	private String landmark;
	private String state;
	private long zipcode;
	
	public Address() {
		System.out.println("Address Object is created");
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
