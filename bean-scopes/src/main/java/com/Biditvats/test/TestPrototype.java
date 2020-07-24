package com.Biditvats.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPrototype {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("prototype.xml");

	}

}
