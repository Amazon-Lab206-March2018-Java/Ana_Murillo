package com.anaroja.NinjaDojo.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.anaroja.NinjaDojo.models.DojoModel;
import com.anaroja.NinjaDojo.models.NinjaModel;
import com.anaroja.NinjaDojo.services.DojoService;
import com.anaroja.NinjaDojo.services.NinjaService;

@Controller
public class controller {
	
	private final DojoService dojoService;
	private final NinjaService ninjaService;
	public controller(DojoService dojoService, NinjaService ninjaService) {
		this.ninjaService = ninjaService;
		this.dojoService = dojoService;
	}

	@RequestMapping ("/")
	public String index() {
		return "redirect:/dojo/new";
	}

	@RequestMapping ("/dojo/new")
	public String newDojo(@ModelAttribute("dojo") DojoModel dojo) {
		return "dojos.jsp";
	}
	
	@PostMapping ("/dojo/new")
	public String createDojo(@Valid @ModelAttribute("dojo") DojoModel dojo, BindingResult result) {
		if (result.hasErrors()) {
			return "dojos.jsp";
		}else {
			dojoService.addDojo(dojo);
			return "redirect:/ninja/new";
		}
    }
	
	@RequestMapping ("/ninja/new")
	public String newNinja(@ModelAttribute ("ninja") NinjaModel ninja, Model m) {
		m.addAttribute("dojo", dojoService.findAll());
		return "ninjas.jsp";
	}
	
	@PostMapping ("/ninja/new")
	public String createNinja(@Valid @ModelAttribute("ninja") NinjaModel ninja, BindingResult result, @RequestParam ("dojo") Long id) {
		if (result.hasErrors()) {
			return "ninjas.jsp";
		}else {
			ninjaService.addNinja(ninja);
			return "redirect:/dojo/"+id;
		}
    }
	
	@RequestMapping ("/dojo/{id}")
	public String showDojos (@PathVariable ("id") Long id, Model m) {
		m.addAttribute("ninja", ninjaService.findByDojo_id(id));
		return "info.jsp";
	}
	
}
