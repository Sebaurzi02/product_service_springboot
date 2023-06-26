package com.service1.product_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.service1.product_service.dto.ProductRequest;
import com.service1.product_service.dto.ProductResponse;
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

	public List<ProductResponse> getAllProducts() {
		List<Product> products = productRepository.findAll();
		return products.stream().map(this::mapToProductResponse).toList();
	}
	
	public ProductResponse mapToProductResponse(Product product) {
		ProductResponse productResponse = new ProductResponse();
		productResponse.setId(product.getId());
		productResponse.setName(product.getName());
		productResponse.setDescription(product.getDescription());
		productResponse.setPrice(product.getPrice());
		return productResponse;
	}

}
