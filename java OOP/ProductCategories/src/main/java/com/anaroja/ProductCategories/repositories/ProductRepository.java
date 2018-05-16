package com.anaroja.ProductCategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.anaroja.ProductCategories.models.ProductModel;

@Repository
public interface ProductRepository extends CrudRepository<ProductModel, Long>{
	List<ProductModel> findAll();
}
