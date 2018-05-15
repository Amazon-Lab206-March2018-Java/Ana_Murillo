package com.anaroja.NinjaDojo.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.anaroja.NinjaDojo.models.DojoModel;
import com.anaroja.NinjaDojo.repositories.DojoRepository;

@Service
public class DojoService {
	
	
	private DojoRepository dojoRepository;

	public DojoService(DojoRepository dojoRepository){
		this.dojoRepository = dojoRepository;
	}
	
	public List<DojoModel> findAll() {
		return dojoRepository.findAll();
	}
	
	public void addDojo(@Valid DojoModel dojo) {
		dojoRepository.save(dojo);
		
	}

}
