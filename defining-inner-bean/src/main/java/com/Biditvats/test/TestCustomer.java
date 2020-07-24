package com.Biditvats.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Biditvats.domain.Address;
import com.Biditvats.domain.Customer;

public class TestCustomer {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Customer customer = context.getBean(Customer.class);
		System.out.println("Customer ID:" +customer.getId());
		System.out.println("Address ID:" +customer.getAddress().getId());
		
		Customer customer1 = (Customer) context.getBean("customer");
		System.out.println("First Name:" +customer1.getFirstName());
		System.out.println("City:"+ customer1.getAddress().getCity());
		
		//Can't access Inner Bean(Address) outside the Customer bean
		/* Address address = context.getBean(Address.class);
		System.out.println("Street:" +address.getStreet()); */
		
		//IoC Container doesn't consider inner bean ID
		//Address address = (Address) context.getBean("address"); 

	}

}
