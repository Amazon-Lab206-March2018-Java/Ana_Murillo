package com.anaroja.NinjaDojo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.anaroja.NinjaDojo.models.DojoModel;

@Repository
public interface DojoRepository extends CrudRepository<DojoModel, Long>{
	List<DojoModel> findAll();
	
}
