package com.anaroja.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/your_server")
public class counter {
	@RequestMapping("")
	public String index(HttpSession sesh) {
		if (sesh.getAttribute("counter") == null) {
			sesh.setAttribute("counter", 0);
		}
		int count = (int) sesh.getAttribute("counter");
		count++;
		sesh.setAttribute("counter", count);
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
    public String count(HttpSession sesh) {
		if (sesh.getAttribute("counter") == null) {
			sesh.setAttribute("counter", 0);
		}
		return "counter.jsp";
	}
}
