package com.Biditvats.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Biditvats.domain.Customer;

public class TestCustomer {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Customer customer = context.getBean(Customer.class);
		System.out.println(customer);

	}

}
