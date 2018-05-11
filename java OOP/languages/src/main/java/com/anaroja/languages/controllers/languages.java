package com.anaroja.languages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.anaroja.languages.models.language;
import com.anaroja.languages.services.LanguageService;

@Controller
public class languages{
	
	private final LanguageService languageService;
	
	public languages(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	@RequestMapping("/languages")
	public String lang(@ModelAttribute("language") language language, Model m) {
		List<language> languages = languageService.allLanguages();
		m.addAttribute("languages", languages);
		return "languagelist.jsp";
	}
	
	@RequestMapping("/languages/{index}")
    public String findLanguageByIndex(Model model, @PathVariable("index") int index) {
		language language = languageService.findLanguageByIndex(index);
        model.addAttribute("language", language);
        return "showLanguage.jsp";
    }
	
	@RequestMapping("/languages/new")
    public String newLanguage(@Valid @ModelAttribute("language") language language, BindingResult result) {
		if (result.hasErrors()) {
			return "languagelist.jsp";
		}else {
			languageService.addLanguage(language);
			return "redirect:/languages";
		}
    }
	
	@RequestMapping("/languages/edit/{id}")
    public String editLanguage(@PathVariable("id") int id, Model model) {
		language language = languageService.findLanguageByIndex(id);
        if (language != null){
            model.addAttribute("language", language);
            return "editLanguage.jsp";
        }else{
            return "redirect:/languages";
        }
    }
	
	@PostMapping("/languages/edit/{id}")
    public String updateLanguage(@PathVariable("id") int id, @Valid @ModelAttribute("language") language language, BindingResult result) {
        if (result.hasErrors()) {
            return "editLanguage.jsp";
        }else{
        	languageService.updateLanguage(id, language);
            return "redirect:/languages";
        }
    }
	
	@RequestMapping(value="/languages/delete/{id}")
    public String destroyLanguage(@PathVariable("id") int id) {
		languageService.destroyLanguage(id);
        return "redirect:/languages";
    }
}
