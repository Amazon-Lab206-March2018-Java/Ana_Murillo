package com.anaroja.DojoOverflow.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.anaroja.DojoOverflow.models.QuestionModel;
import com.anaroja.DojoOverflow.repositories.QuestionRepository;

@Service
public class QuestionService {
	
	private QuestionRepository questionRepository;
	
	public QuestionService(QuestionRepository questionRepository) {
		this.questionRepository = questionRepository;
	}
	
	public List<QuestionModel> findAll() {
		return questionRepository.findAll();
	}
	
	public QuestionModel addQuestion(@Valid QuestionModel category) {
		return questionRepository.save(category);
		
	}
	
	public QuestionModel findById(Long id) {
		Optional<QuestionModel> q = questionRepository.findById(id);
		if (q != null) {
			return q.get();
		}
		return null;
	}
}
