package com.Biditvats.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Biditvats.domain.Address;
import com.Biditvats.domain.Admin;
import com.Biditvats.domain.Customer;

public class TestPrototypeInSingleton {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("prototype-in-singleton.xml");
		
		context.getBean(Customer.class);
		context.getBean(Admin.class);
		context.getBean(Address.class);

	}

}
