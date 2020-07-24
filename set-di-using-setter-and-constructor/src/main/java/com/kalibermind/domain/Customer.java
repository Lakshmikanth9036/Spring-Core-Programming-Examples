package com.kalibermind.domain;

import java.util.Set;

public class Customer {
	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private Set<Long> mobiles;
	
	public Customer() {
		System.out.println("Customer object is created");
	}

	public Customer(long id, String firstName, String lastName, String email, Set<Long> mobiles) {
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

	public Set<Long> getMobiles() {
		return mobiles;
	}

	public void setMobiles(Set<Long> mobiles) {
		this.mobiles = mobiles;
	}
	
}
