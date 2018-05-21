package com.anaroja.javabelt.controllers;

import java.security.Principal;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.anaroja.javabelt.models.Ideas;
import com.anaroja.javabelt.services.IdeasService;
import com.anaroja.javabelt.services.UserService;

@Controller
public class IdeasController {

	private IdeasService ideasService;
	private UserService uServ;
	
public IdeasController(IdeasService ideasService, UserService uServ) {
	this.ideasService = ideasService;
	this.uServ = uServ;
}
//Ideas
@RequestMapping ("/ideas/new")
public String newIdea(@ModelAttribute("idea") Ideas idea, Principal principal,  Model model) {
	String username = principal.getName();
    model.addAttribute("currentUser", uServ.findByUsername(username));
	return "newIdea.jsp";
}

@PostMapping ("/ideas/new")
public String createIdea(@Valid @ModelAttribute("idea") Ideas idea, BindingResult result) {
	if (result.hasErrors()) {
		return "newIdea.jsp";
	}else {
		ideasService.addIdea(idea);
		return "redirect:/ideas";
	}
}


@RequestMapping ("/ideas/{id}")
public String showIdeat (@PathVariable ("id") Long id, Model m) {
	m.addAttribute("idea", ideasService.findById(id));
	return "ideas.jsp";
}

@RequestMapping ("/update")
public String update(@ModelAttribute("idea") Ideas idea, Principal principal,  Model model) {
	return "edit.jsp";
}

@RequestMapping ("/ideas/{id}/update")
public String update (@PathVariable ("id") Long id, Model m) {
	m.addAttribute("idea", ideasService.findById(id));
	return "edit.jsp";
}

@PostMapping ("/ideas/{id}/update")
public String updateIdea(@Valid @ModelAttribute("idea") Ideas idea, BindingResult result, @PathVariable ("id") Long id) {
	if (result.hasErrors()) {
		return "edit.jsp";
	}else {
		ideasService.updateIdea(idea);
		return "redirect:/ideas/{id}";
	}
}

@RequestMapping("/delete/{id}")
public String delete(@PathVariable("id") Long id) {
	ideasService.deleteIdeaById(id);
    return "redirect:/ideas";
}

}
