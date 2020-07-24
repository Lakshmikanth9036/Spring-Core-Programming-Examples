package com.kalibermind.domain;

import java.util.List;

public class Customer {
	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private List<Long> mobiles;
	
	public Customer() {
		System.out.println("Customer object is created");
	}

	public Customer(long id, String firstName, String lastName, String email, List<Long> mobiles) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobiles = mobiles;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Long> getMobiles() {
		return mobiles;
	}

	public void setMobiles(List<Long> mobiles) {
		this.mobiles = mobiles;
	}
	
}
