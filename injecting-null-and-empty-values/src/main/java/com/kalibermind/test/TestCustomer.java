package com.kalibermind.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kalibermind.domain.Customer;

public class TestCustomer {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Customer customer = context.getBean(Customer.class);
		
		System.out.println("Customer ID :" +customer.getId());
		System.out.println("Customer FirstName :" +customer.getFirstName());
		System.out.println("Customer LastName :" +customer.getLastName());
		System.out.println("Customer Email :" +customer.getEmail());
		System.out.println("Customer Mobile :" +customer.getMobile());

	}

}
