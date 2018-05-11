package com.anaroja.learningplatform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainPage {
	
	@RequestMapping("/")
	public String main() {
		System.out.print("yesjsadujd");
		return "index.jsp";
	}
	
	@RequestMapping("/m/{chapter}/0483/{assignmentNumber}")
	public String assignment(@PathVariable String chapter, @PathVariable String assignmentNumber, Model m) {
		if (assignmentNumber.equals("0345")) {
			m.addAttribute("message","Coding Forms");
		}
		else if (assignmentNumber.equals("2342")) {
			m.addAttribute("message","Fortran to Binary");
		}
	return "assignment.jsp";
		
	}
	
	@RequestMapping("/m/{lesson}/0553/{lessonNumber}")
	public String lesson(@PathVariable String lesson, @PathVariable String lessonNumber, Model m) {
		if (lessonNumber.equals("0733")) {
			m.addAttribute("message","Setting up your servers");
		}
		else if (lessonNumber.equals("0342")) {
			m.addAttribute("message","Punch Cards");
		}
		else if (lessonNumber.equals("0348")) {
			m.addAttribute("message","Advanced Fortran Intro");
		}
		return "lesson.jsp";
	}
}
