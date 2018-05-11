package com.anaroja.languages.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;
import com.anaroja.languages.models.language;


@Service
public class LanguageService {
	List<language> langs = new ArrayList<language>(Arrays.asList(
			new language("Java", "James Gosling", 302)));
	public List<language> allLanguages(){
		return langs;
	}
	public language findLanguageByIndex(int index) {
		if (index < langs.size()){
            return langs.get(index);
        }else{
		return null;
        }
	}
	public void addLanguage(@Valid language language) {
		langs.add(language);	
	}
	public void updateLanguage(int id, @Valid language language) {
		if (id < langs.size()){
			langs.set(id, language);
        }
		
	}
	public void destroyLanguage(int id) {
		if (id < langs.size()){
			langs.remove(id);
        }
		
	}
}
