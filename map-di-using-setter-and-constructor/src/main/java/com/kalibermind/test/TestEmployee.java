package com.kalibermind.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kalibermind.domain.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Employee employee = context.getBean(Employee.class);
		
		System.out.println("Employee ID :" +employee.getId());
		System.out.println("Employee Name :" +employee.getName());
		System.out.println("Employee Email :" +employee.getEmail());
		System.out.println("Employee Salary :" +employee.getSalary());
		System.out.println("Employee Projects :" +employee.getProjects());
		

	}

}
