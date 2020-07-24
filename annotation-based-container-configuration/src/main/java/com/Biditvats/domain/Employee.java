package com.Biditvats.domain;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Qualifier("employee")
@Lazy(true)
public class Employee {
	private long id;
	private String name;
	private String email;
	private String dept;
	private double salary;
	
	@Autowired
	private Address address;
	
	public Employee() {
		System.out.println("Employee object is created");
	}

	public long getId() {
		return id;
	}
    
	@Required
	@Value("1001")
	public void setId(long id) {
		System.out.println("setId() Method is called");
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	@Value("Bidit vats")
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}
    
	@Value("Biditvats@gmail.com")
	public void setEmail(String email) {
		this.email = email;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@PostConstruct
	public void init() {
		System.out.println("init() - Employee Bean is Initialized!");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy() - Employee Bean is destroyed!");
	}
	
}


