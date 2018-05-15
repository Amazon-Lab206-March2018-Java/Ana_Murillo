package com.anaroja.license.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.anaroja.license.models.License;
import com.anaroja.license.models.Person;
import com.anaroja.license.services.LicenseService;
import com.anaroja.license.services.PersonService;

@Controller
public class controller {
	private final PersonService personService;
	private final LicenseService licenseService;
	
	public controller(PersonService personService, LicenseService licenseService) {
		this.personService = personService;
		this.licenseService = licenseService;
	}
	
	@RequestMapping ("/")
	public String index() {
		return "redirect:/persons/new";
	}

	@RequestMapping ("/persons/new")
	public String newPerson(@ModelAttribute("person") Person person) {
		return "person.jsp";
	}
	
	@PostMapping ("/persons/new")
	public String createPerson(@Valid @ModelAttribute("person") Person person, BindingResult result) {
		if (result.hasErrors()) {
			return "person.jsp";
		}else {
			personService.addPerson(person);
			return "redirect:/licenses/new";
		}
    }
	
	@RequestMapping ("/licenses/new")
	public String newLicense(@ModelAttribute ("license") License license, Model m) {
		m.addAttribute("persons", personService.findAll());
		m.addAttribute("licenseNumber", String.format("%05o", 1+licenseService.findAll().size()));
		return "license.jsp";
	}
	
	@PostMapping ("/licenses/new")
	public String createLicense(@Valid @ModelAttribute("license") License license, BindingResult result) {
		if (result.hasErrors()) {
			return "license.jsp";
		}else {
			licenseService.addLicense(license);
			return "redirect:/licenses/new";
		}
    }
	
	@RequestMapping("/person/{id}")
    public String findPersonById(Model model, @PathVariable("id") Long id) {
        model.addAttribute("person", personService.findById(id));
        model.addAttribute("license", licenseService.findById(id));
        return "showPerson.jsp";
    }

}
