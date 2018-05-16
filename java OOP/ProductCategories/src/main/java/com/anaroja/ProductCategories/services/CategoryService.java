package com.anaroja.ProductCategories.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.anaroja.ProductCategories.models.CategoryModel;
import com.anaroja.ProductCategories.models.ProductModel;
import com.anaroja.ProductCategories.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	private CategoryRepository categoryRepository;
	
	public CategoryService(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}
	
	public List<CategoryModel> findAll(){
		return categoryRepository.findAll();
	}
	
	public void addCategory(@Valid CategoryModel category) {
		categoryRepository.save(category);
		
	}
	
	public CategoryModel findById(Long id) {
		Optional <CategoryModel> oCategory = categoryRepository.findById(id);
		return oCategory.get();
	}

	public void updateCategories(ProductModel product, CategoryModel category) {
		category.updateProduct(product);
		categoryRepository.save(category);
	}

}