package com.anaroja.secondtry.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.anaroja.secondtry.models.Shows;


@Repository
public interface ShowRepository extends CrudRepository<Shows, Long>{
	List<Shows> findAll();

}
