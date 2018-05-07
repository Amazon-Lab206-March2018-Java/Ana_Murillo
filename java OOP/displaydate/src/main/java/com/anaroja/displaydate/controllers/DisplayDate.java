package com.anaroja.displaydate.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisplayDate {

	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}

	@RequestMapping("/time")
	public String time(Model v) {
		Date d = new Date();
		v.addAttribute("time", d);
		return "time.jsp";
	}

	@RequestMapping("/date")
	public String date(Model m) {
		Date d = new Date();
		m.addAttribute("date", d);
		return "date.jsp";
	}

}
