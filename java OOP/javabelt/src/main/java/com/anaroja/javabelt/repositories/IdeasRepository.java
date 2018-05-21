package com.anaroja.javabelt.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.anaroja.javabelt.models.Ideas;

@Repository
public interface IdeasRepository extends CrudRepository<Ideas, Long>{
	List<Ideas> findAll();

}
