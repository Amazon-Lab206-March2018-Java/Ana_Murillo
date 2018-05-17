package com.anaroja.DojoOverflow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.anaroja.DojoOverflow.models.QuestionModel;

@Repository
public interface QuestionRepository extends CrudRepository<QuestionModel, Long>{
	List<QuestionModel> findAll();
}
