package com.Biditvats.domain;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
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
    
	@Value("1100")
	public void setId(long id) {
		this.id = id;
	}

	public String getHouseNo() {
		return houseNo;
	}
    
	@Value("H-1318, Ground floor")
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreet() {
		return street;
	}
    
	@Value("JP Nagar, 2nd Phase")
	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}
    
	@Required
	@Value("Bangalore")
	public void setCity(String city) {
		this.city = city;
	}

	public String getLandmark() {
		return landmark;
	}
    
	@Value("Next to Bangalore Central Mall")
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getState() {
		return state;
	}
    
	@Value("Karnataka")
	public void setState(String state) {
		this.state = state;
	}

	public long getZipcode() {
		return zipcode;
	}
    
	@Value("560076")
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


