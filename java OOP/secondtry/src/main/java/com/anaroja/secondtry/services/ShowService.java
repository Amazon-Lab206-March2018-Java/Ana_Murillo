package com.anaroja.secondtry.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.anaroja.secondtry.models.Shows;
import com.anaroja.secondtry.repositories.ShowRepository;


@Service
public class ShowService {

	private ShowRepository showRepository;
	
	public ShowService(ShowRepository showRepository) {
		this.showRepository =showRepository;
	}
	
	public List<Shows> findAll(){
		return showRepository.findAll();
	}
	
	public void addShow(@Valid Shows show) {
		showRepository.save(show);
		
	}

	public Shows findById(Long id) {
		Optional <Shows> oIdea = showRepository.findById(id);
		return oIdea.get();
	}
	
	public void updateShow (Shows show) {
		showRepository.save(show);
	}
	
	public void deleteShowById(Long id) {
		showRepository.deleteById(id);
	}
}
