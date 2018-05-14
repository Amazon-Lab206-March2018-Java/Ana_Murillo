package com.anaroja.languages.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.anaroja.languages.models.language;
import com.anaroja.languages.repositories.LanguageRepository;


@Service
public class LanguageService {
	private LanguageRepository languageRepository;
    public LanguageService(LanguageRepository languageRepository){
        this.languageRepository = languageRepository;
    }

	public List<language> allLanguages(){
        return languageRepository.findAll();
	}
	public language findLanguageById(Long id) {
		Optional<language> optionalLanguage = languageRepository.findById(id);
        if(optionalLanguage.isPresent()) {
            return optionalLanguage.get();
        } else {
            return null;
        }
	}
	public void addLanguage(@Valid language language) {
		languageRepository.save(language);
	}
	public void updateLanguage(@Valid language language) {
		languageRepository.save(language);
		
	}
	public void destroyLanguage(Long id) {
		languageRepository.deleteById(id);
	}
}
