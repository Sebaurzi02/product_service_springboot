package com.service1.product_service.service;

import org.springframework.stereotype.Service;

import com.service1.product_service.dto.ProductRequest;
import com.service1.product_service.model.Product;
import com.service1.product_service.repository.ProductRepository;

@Service
public class ProductService {
	
	private ProductRepository productRepository;
	
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	public void createProduct(ProductRequest productRequest) {
		Product product = new Product();
		product.setName(productRequest.getName());
		product.setDescription(productRequest.getDescription());
		product.setPrice(productRequest.getPrice());
		
		productRepository.save(product);
	}

}
