package com.Biditvats.domain;

public class Employee {
	private long id;
	private String name;
	private String email;
	private String dept;
	private double salary;
	
	public Employee() {
		System.out.println("Employee object is created");
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		System.out.println("setId() Method is called");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

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
	
	public void init() {
		System.out.println("init() - Employee Bean is Initialized!");
	}
	
	public void destroy() {
		System.out.println("destroy() - Employee Bean is destroyed!");
	}
	
}
