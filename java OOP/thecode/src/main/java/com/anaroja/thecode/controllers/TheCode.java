package com.anaroja.thecode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TheCode {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(path="/code", method=RequestMethod.POST)
	public String thecode(@RequestParam(value="code") String code, RedirectAttributes redirecAttributes) {
		if (code.equals("bushido")) {
			return "code.jsp";
		} else {
			redirecAttributes.addFlashAttribute("errors", "That ain't the code!! You must train harder");
		}
		return "redirect:/";
	}
}
