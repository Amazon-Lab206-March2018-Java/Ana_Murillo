package com.anaroja.NinjaDojo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.anaroja.NinjaDojo.models.NinjaModel;

@Repository
public interface NinjaRepository extends CrudRepository<NinjaModel, Long>{
	List<NinjaModel> findAll();

	List<NinjaModel> findByDojo_id(Long id);

}
