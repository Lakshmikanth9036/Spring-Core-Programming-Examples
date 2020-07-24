package com.kalibermind.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kalibermind.domain.Product;

public class TestProduct {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		//There are two Product bean Object, so can't get byType
		//Product product = context.getBean(Product.class);
		
		//Getting Product 1 (Injected by Setter DI)
		Product product1 = (Product)context.getBean("product1");
		System.out.println("Product ID:" +product1.getId());
		System.out.println("Name:" +product1.getName());
		System.out.println("Model:" +product1.getModel());
		System.out.println("Brand:" +product1.getBrand());
		System.out.println("Price:" +product1.getPrice());
		System.out.println("Description:" +product1.getProductDesc());
		
		//Getting Product 2 (Injected by Constructor DI)
		Product product2 = (Product)context.getBean("product2");
		System.out.println("Product ID:" +product2.getId());
		System.out.println("Name:" +product2.getName());
		System.out.println("Model:" +product2.getModel());
		System.out.println("Brand:" +product2.getBrand());
		System.out.println("Price:" +product2.getPrice());
		System.out.println("Description:" +product2.getProductDesc());

	}

}
