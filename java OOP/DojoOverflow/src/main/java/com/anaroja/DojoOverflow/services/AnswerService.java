package com.anaroja.DojoOverflow.services;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.anaroja.DojoOverflow.models.AnswerModel;
import com.anaroja.DojoOverflow.repositories.AnswerRepository;

@Service
public class AnswerService {

	private AnswerRepository answerRepository;
	
	public AnswerService(AnswerRepository answerRepository) {
		this.answerRepository = answerRepository;
	}
	
	public void addAnswer(@Valid AnswerModel answer) {
		answerRepository.save(answer);
	}
}
