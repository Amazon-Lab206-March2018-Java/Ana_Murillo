package com.anaroja.javabelt.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.anaroja.javabelt.models.Ideas;
import com.anaroja.javabelt.repositories.IdeasRepository;

@Service
public class IdeasService {

	private IdeasRepository ideasRepository;
	
	public IdeasService(IdeasRepository ideasRepository) {
		this.ideasRepository =ideasRepository;
	}
	
	public List<Ideas> findAll(){
		return ideasRepository.findAll();
	}
	
	public void addIdea(@Valid Ideas idea) {
		ideasRepository.save(idea);
		
	}

	public Ideas findById(Long id) {
		Optional <Ideas> oIdea = ideasRepository.findById(id);
		return oIdea.get();
	}
	
	public void updateIdea (Ideas idea) {
		ideasRepository.save(idea);
	}
	
	public void deleteIdeaById(Long id) {
		ideasRepository.deleteById(id);
	}
}
