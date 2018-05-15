package com.anaroja.license.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.anaroja.license.models.License;
import com.anaroja.license.repositories.LicenseRepository;

@Service
public class LicenseService {
	private LicenseRepository licenseRepository;
    public LicenseService(LicenseRepository licenseRepository){
        this.licenseRepository = licenseRepository;
    }
    
    public void addLicense(@Valid License license) {
		licenseRepository.save(license);
	}

    public License findById(Long id) {
		Optional<License> optionalLicenseon =licenseRepository.findById(id);
		return optionalLicenseon.get();
	}

	public List<License> findAll() {
		return licenseRepository.findAll();
	}

}
