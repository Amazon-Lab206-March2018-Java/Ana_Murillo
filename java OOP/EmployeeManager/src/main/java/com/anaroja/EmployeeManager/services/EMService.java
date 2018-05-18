package com.anaroja.EmployeeManager.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.anaroja.EmployeeManager.models.EMModel;
import com.anaroja.EmployeeManager.repositories.EMRepository;

@Service
public class EMService {

	private final EMRepository emRepository;
	private EMService(EMRepository emRepository){
		this.emRepository = emRepository;
	}

	public EMModel findByName(String fName, String sName) {
		return emRepository.findByFullName(fName,sName);
	}
	
	public void createEmployee (EMModel man1) {
		emRepository.save(man1);
	}

	public EMModel findById (Long id) {
		Optional<EMModel> employee = emRepository.findById(id);
		if (employee == null) {
			return null;
		} else {
			return employee.get();
		}
	}

}
