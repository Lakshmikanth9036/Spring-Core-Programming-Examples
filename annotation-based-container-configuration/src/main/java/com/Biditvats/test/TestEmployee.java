package com.Biditvats.test;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Biditvats.domain.Address;
import com.Biditvats.domain.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Employee employee1 = context.getBean(Employee.class);
		
		Address address = context.getBean(Address.class);
		
		Employee employee2 = context.getBean(Employee.class);
		
		System.out.println("Employee ID:" +employee1.getId());
        System.out.println("Empoyee Name:" +employee1.getName());
        System.out.println("Employee email:" +employee1.getEmail());
        System.out.println(employee1.getAddress());
        
        context.registerShutdownHook();
       
		
		

	}

}
