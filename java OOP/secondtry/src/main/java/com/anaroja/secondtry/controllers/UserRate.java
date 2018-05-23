package com.anaroja.secondtry.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.anaroja.secondtry.models.UserRates;
import com.anaroja.secondtry.services.UserRateService;

@Controller
public class UserRate {
	
	private UserRateService urSev;
	
	public UserRate(UserRateService urSev) {
		this.urSev = urSev;
	}
	
	@PostMapping ("/shows/{id}/rating")
	public String createRate(@Valid @ModelAttribute("userrates") UserRates userrates, BindingResult result, @PathVariable ("id") Long id) {
		if (result.hasErrors()) {
			return "shows.jsp";
		}else {
			urSev.addRate(userrates);
			return "redirect:/shows";
		}
	}

}
