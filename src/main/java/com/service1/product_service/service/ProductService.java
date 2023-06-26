package com.service1.product_service.service;

import org.springframework.stereotype.Service;

import com.service1.product_service.controller.dto.ProductRequest;
import com.service1.product_service.model.Product;

@Service
public class ProductService {
	
	public void createProduct(ProductRequest productRequest) {
		Product product = new Product();
		product.setName(productRequest.getName());
		product.setDescription(productRequest.getDescription());
		product.setPrice(productRequest.getPrice());
		
	}

}
