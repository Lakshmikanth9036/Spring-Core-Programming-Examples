package com.kalibermind.domain;

import java.util.Map;

public class Employee {
	private long id;
	private String name;
	private String email;
	private double Salary;
	private Map<String, String> projects;
	
	public Employee() {
		System.out.println("Employee Object is Created");
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	public Map<String, String> getProjects() {
		return projects;
	}

	public void setProjects(Map<String, String> projects) {
		this.projects = projects;
	}
	
}
