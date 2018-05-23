package com.anaroja.secondtry.services;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.anaroja.secondtry.models.UserRates;
import com.anaroja.secondtry.repositories.UserRateRepository;

@Service
public class UserRateService {

	private UserRateRepository urRepo;
	
	public UserRateService(UserRateRepository urRepo) {
		this.urRepo = urRepo;
	}

	public void addRate(@Valid UserRates userrates) {
		urRepo.save(userrates);
		
	}
}
