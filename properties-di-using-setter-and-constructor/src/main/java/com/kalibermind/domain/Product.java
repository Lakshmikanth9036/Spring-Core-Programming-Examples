package com.kalibermind.domain;

import java.util.Properties;

public class Product {
	private long id;
	private String name;
	private String model;
	private String brand;
	private double price;
	private Properties productDesc; 
	
	public Product() {
		System.out.println("Product object is created");
	}

	public Product(long id, String name, String model, String brand, double price, Properties productDesc) {
		super();
		this.id = id;
		this.name = name;
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.productDesc = productDesc;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Properties getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(Properties productDesc) {
		this.productDesc = productDesc;
	}
	
	
}
