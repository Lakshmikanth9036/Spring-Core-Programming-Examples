package com.kalibermind.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCustomer {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		//There are two Customer object here, So can't get byType
		//Customer customer = context.getBean(Customer.class);
		
		//Getting Customer 1 (Injected By Setter DI)
		Customer customer1 = (Customer) context.getBean("customer1");
		System.out.println("Customer ID :" +customer1.getId());
		System.out.println("Customer FirstName :" +customer1.getFirstName());
		System.out.println("Customer LastName :" +customer1.getLastName());
		System.out.println("Customer Email :" +customer1.getEmail());
		System.out.println("Customer Mobiles :" +customer1.getMobiles());
		
		//Getting Customer 1 (Injected By Constructor DI)
		Customer customer2 = (Customer) context.getBean("customer2");
		System.out.println("Customer ID :" +customer2.getId());
		System.out.println("Customer FirstName :" +customer2.getFirstName());
		System.out.println("Customer LastName :" +customer2.getLastName());
		System.out.println("Customer Email :" +customer2.getEmail());
		System.out.println("Customer Mobiles :" +customer2.getMobiles());

	}

}
