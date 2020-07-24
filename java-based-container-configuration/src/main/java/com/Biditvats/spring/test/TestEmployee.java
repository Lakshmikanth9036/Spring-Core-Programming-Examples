package com.Biditvats.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Biditvats.spring.bean.Employee;
import com.Biditvats.spring.config.JavaConfig;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

		Employee emp = context.getBean(Employee.class);
		
		System.out.println("Employee name:" +emp.getEmpName());
	}

}
