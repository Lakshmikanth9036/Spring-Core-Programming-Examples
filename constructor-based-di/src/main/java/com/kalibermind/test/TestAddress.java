package com.kalibermind.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kalibermind.domain.Address;

public class TestAddress {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");
		
		Address address = context.getBean(Address.class);
		
		System.out.println(address);

	}

}
