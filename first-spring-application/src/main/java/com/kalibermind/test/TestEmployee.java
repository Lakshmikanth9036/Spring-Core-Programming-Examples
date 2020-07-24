package com.kalibermind.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.kalibermind.domain.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		//create Resource
		Resource resource = new ClassPathResource("Application.xml");
		
		//create BeanFactory IOC Container
		BeanFactory factory = new XmlBeanFactory(resource);
		
		//Getting Bean Object
		Employee employee = (Employee)factory.getBean("employee");
		
		/* Or you can use this also
		 * Employee employee = factory.getBean(Employee.class);
		 */
		
		System.out.println("Emp ID: " +employee.getId());
		System.out.println("Name: " +employee.getName());
		System.out.println("Email: " +employee.getEmail());
		System.out.println("Salary: " +employee.getSalary());

	}

}
