package com.anaroja.NinjaDojo.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.anaroja.NinjaDojo.models.NinjaModel;
import com.anaroja.NinjaDojo.repositories.NinjaRepository;

@Service
public class NinjaService {
	
	private NinjaRepository ninjaRepository;
	
	public NinjaService(NinjaRepository ninjaRepository){
		this.ninjaRepository = ninjaRepository;
	}
	
	public List<NinjaModel> findByDojo_id(Long id) {
		return ninjaRepository.findByDojo_id(id);
	}

	public void addNinja(@Valid NinjaModel ninja) {
		ninjaRepository.save(ninja);
		
	}

}
