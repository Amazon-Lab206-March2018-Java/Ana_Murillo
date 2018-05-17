package com.anaroja.DojoOverflow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.anaroja.DojoOverflow.models.AnswerModel;

@Repository
public interface AnswerRepository extends CrudRepository<AnswerModel, Long>{
	
	List<AnswerModel> findAll();
	
	List<AnswerModel> findByQuestion_id(Long id);
}
