package com.Biditvats.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.Biditvats.spring.bean.Address;
import com.Biditvats.spring.bean.Employee;

@Configuration
public class JavaConfig {
    
	@Bean
	public Employee getEmployee() {
		return new Employee();
	}
	
	@Bean
	public Address getAddress() {
		return new Address();
	}
	
}
