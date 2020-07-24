package com.Biditvats.test;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Biditvats.domain.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Employee e = (Employee) context.getBean("employee");
		 System.out.println(""+e.getName());
		//Here you need to register a shutdown hook registerShutdownHook() method that is declared on the AbstractApplicationContext class. 
		//This will ensure a graceful shutdown and call the relevant destroy methods.
		context.registerShutdownHook(); 
      
	}

}
