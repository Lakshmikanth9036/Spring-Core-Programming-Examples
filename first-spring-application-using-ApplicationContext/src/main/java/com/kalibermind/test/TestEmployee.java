package com.kalibermind.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kalibermind.domain.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");
		
		Employee employee = (Employee)context.getBean("employee");
		
		System.out.println("Emp ID: " +employee.getId());
		System.out.println("Name: " +employee.getName());
		System.out.println("Email: " +employee.getEmail());
		System.out.println("Salary: " +employee.getSalary());

	}

}
