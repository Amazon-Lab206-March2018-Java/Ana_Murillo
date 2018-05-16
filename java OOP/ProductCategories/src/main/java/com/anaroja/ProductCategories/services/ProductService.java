package com.anaroja.ProductCategories.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.anaroja.ProductCategories.models.CategoryModel;
import com.anaroja.ProductCategories.models.ProductModel;
import com.anaroja.ProductCategories.repositories.ProductRepository;

@Service
public class ProductService {
	
	private ProductRepository productRepository;
	
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	public List<ProductModel> findAll(){
		return productRepository.findAll();
	}
	
	public void addProduct(@Valid ProductModel product) {
		productRepository.save(product);
		
	}
	
	public ProductModel findById(Long id) {
		Optional <ProductModel> oProduct = productRepository.findById(id);
		return oProduct.get();
	}

	public void updateProducts (ProductModel product, CategoryModel category) {
		product.updateCategory(category);
		productRepository.save(product);
	}
}
