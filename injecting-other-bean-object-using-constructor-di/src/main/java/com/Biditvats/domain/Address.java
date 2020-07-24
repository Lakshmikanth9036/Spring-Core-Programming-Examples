package com.Biditvats.domain;

public class Address {
	private long id;
	private String houseNo;
	private String street;
	private String city;
	private String landmark;
	private String state;
	private long zipcode;
	
	
	public Address(long id, String houseNo, String street, String city, String landmark, String state, long zipcode) {
		super();
		this.id = id;
		this.houseNo = houseNo;
		this.street = street;
		this.city = city;
		this.landmark = landmark;
		this.state = state;
		this.zipcode = zipcode;
	}
	
	@Override
	public String toString() {
		return "Address ID: "+id
				+"\nHouse No: "+houseNo
				+"\nStreet: "+street
				+"\nCity: "+city
				+"\nLandmark: "+landmark
				+"\nState: "+state
				+"\nZipcode: "+zipcode;
				
	}
}
