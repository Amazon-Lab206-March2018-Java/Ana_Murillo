package com.anaroja.firstry.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.anaroja.firstry.models.Ideas;

@Repository
public interface IdeasRepository extends CrudRepository<Ideas, Long>{
	List<Ideas> findAll();

}
