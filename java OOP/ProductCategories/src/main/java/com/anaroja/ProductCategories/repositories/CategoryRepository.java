package com.anaroja.ProductCategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.anaroja.ProductCategories.models.CategoryModel;

@Repository
public interface CategoryRepository extends CrudRepository<CategoryModel, Long>{
	List<CategoryModel> findAll();
}
