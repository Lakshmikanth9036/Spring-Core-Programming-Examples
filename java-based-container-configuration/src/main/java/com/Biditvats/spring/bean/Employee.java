package com.Biditvats.spring.bean;

public class Employee {
	private long empId;
	private String empName;
	private String email;
	private String dept;
	private double salary;
	private Address address;
	
	public Employee() {
		System.out.println("Employee object is created");
	}

	public Employee(long empId, String empName, String email, String dept, double salary,Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.email = email;
		this.dept = dept;
		this.salary = salary;
		this.address = address;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
