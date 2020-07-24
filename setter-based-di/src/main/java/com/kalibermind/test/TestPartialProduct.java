package com.kalibermind.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kalibermind.domain.Product;

public class TestPartialProduct {

	public static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("spring-partial.xml");
		
		//Getting bean object byName(id) (required down casting)
		Product product1 = (Product)context.getBean("product");
		System.out.println("Product ID :" +product1.getId());
		System.out.println();
		
		//Getting bean object Type
		Product product2 = context.getBean(Product.class);
		System.out.println("Brand :" +product2.getBrand());

	}

}
