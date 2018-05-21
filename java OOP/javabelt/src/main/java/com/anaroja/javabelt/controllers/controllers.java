package com.anaroja.javabelt.controllers;

import java.security.Principal;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.anaroja.javabelt.models.Ideas;
import com.anaroja.javabelt.models.User;
import com.anaroja.javabelt.services.IdeasService;
import com.anaroja.javabelt.services.UserService;
import com.anaroja.javabelt.validator.UserValidator;

@Controller
public class controllers {
	private UserService userService;
	private UserValidator userValidator;
	private IdeasService ideasService;


public controllers(UserService userService, UserValidator userValidator, IdeasService ideasService) {
    this.userService = userService;
    this.userValidator = userValidator;
    this.ideasService = ideasService;
}
	 
	 @PostMapping("/registration")
	    public String registration(@Valid @ModelAttribute("user") User user, BindingResult result, Model model) {
	        userValidator.validate(user, result);
	        if (result.hasErrors()) {
	            return "registrationPage.jsp";
	        }else {
	        	model.addAttribute("registrationMessage", "Registration Successful. Continue to login.");
	    		if (userService.allUsers().size() == 0) {
	    			userService.saveUserWithAdminRole(user);
	    		} else {
	    			userService.saveWithUserRole(user);
	    		}
	        return "redirect:/login";
	        }	
        }
	 
	    @RequestMapping("/login")
	    public String login(@Valid @ModelAttribute("user") User user, @RequestParam(value="error", required=false) String error, @RequestParam(value="logout", required=false) String logout, Model model) {
	        if(error != null) {
	            model.addAttribute("errorMessage", "Invalid Credentials, Please try again.");
	        }
	        if(logout != null) {
	            model.addAttribute("logoutMessage", "Logout Successful!");
	        }
	        return "registrationPage.jsp";
	    }
	 
	    @RequestMapping(value = {"/ideas", "/"})
	    public String home(Principal principal, Model model, @ModelAttribute("idea") Ideas idea) {
	        String username = principal.getName();
	        model.addAttribute("currentUser", userService.findByUsername(username));
	        List<Ideas> ideas = ideasService.findAll();
	        model.addAttribute("idea", ideas);
	        return "homePage.jsp";
	    }

	   
}
