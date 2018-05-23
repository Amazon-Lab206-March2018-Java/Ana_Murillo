package com.anaroja.secondtry.controllers;

import java.security.Principal;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.anaroja.secondtry.models.Shows;
import com.anaroja.secondtry.models.UserRates;
import com.anaroja.secondtry.services.ShowService;
import com.anaroja.secondtry.services.UserService;


@Controller
public class ShowController {

	private ShowService showService;
	private UserService uServ;
	
public ShowController(ShowService showService, UserService uServ) {
	this.showService = showService;
	this.uServ = uServ;
}
//Shows
@RequestMapping ("/shows/new")
public String newShow(@ModelAttribute("show") Shows show, Principal principal,  Model model) {
	String username = principal.getName();
    model.addAttribute("currentUser", uServ.findByUsername(username));
	return "newShow.jsp";
}

@PostMapping ("/shows/new")
public String createShow(@Valid @ModelAttribute("show") Shows show, BindingResult result) {
	if (result.hasErrors()) {
		System.out.println("it has an error");
		return "newShow.jsp";
	}else {
		showService.addShow(show);
		return "redirect:/shows";
	}
}

@RequestMapping ("/shows/{id}")
public String showShows (@PathVariable ("id") Long id, Model m,Principal principal, @ModelAttribute("userrates") UserRates userrates) {
	String username = principal.getName();
	m.addAttribute("currentUser", uServ.findByUsername(username));
	m.addAttribute("show", showService.findById(id));
	return "shows.jsp";
}

@RequestMapping ("/update")
public String update(@ModelAttribute("show") Shows show, Principal principal,  Model model) {
	return "edit.jsp";
}

@RequestMapping ("/shows/{id}/update")
public String update (@PathVariable ("id") Long id, Model m) {
	m.addAttribute("show", showService.findById(id));
	return "edit.jsp";
}

@PostMapping ("/shows/{id}/update")
public String updateShow(@Valid @ModelAttribute("show") Shows show, BindingResult result, @PathVariable ("id") Long id) {
	if (result.hasErrors()) {
		return "edit.jsp";
	}else {
		showService.updateShow(show);
		return "redirect:/shows/{id}";
	}
}

@RequestMapping("/delete/{id}")
public String delete(@PathVariable("id") Long id) {
	showService.deleteShowById(id);
    return "redirect:/shows";
}

}
