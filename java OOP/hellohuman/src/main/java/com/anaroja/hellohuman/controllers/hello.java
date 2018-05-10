package com.anaroja.hellohuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class hello {
	@RequestMapping("/")
	public String index(@RequestParam(value="name", required=false) String name, Model m) {
        if (name !=null) {
        	m.addAttribute("name", name);
        }
        else {
        	m.addAttribute("name", "Human");
        }
        return "home.jsp";
    }

}
