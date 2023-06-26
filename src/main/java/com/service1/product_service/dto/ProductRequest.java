package com.service1.product_service.dto;


public class ProductRequest {
	private String name;
	private String description;
	private float price;
	
	public ProductRequest() {}
	
	public ProductRequest(String name , String description , float price) {
		this.name = name;
		this.description = description;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
}