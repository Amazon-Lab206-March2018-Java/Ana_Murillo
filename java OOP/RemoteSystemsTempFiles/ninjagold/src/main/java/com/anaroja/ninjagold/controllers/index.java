package com.anaroja.ninjagold.controllers;

import java.text.SimpleDateFormat;
import java.util.*;


import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class index {
	@RequestMapping("/")
	@SuppressWarnings("rawtypes")
	public String main(HttpSession session) {
		if (session.getAttribute("Activities") == null) {
			ArrayList<Map> act = new ArrayList<Map>();
			session.setAttribute("gold", 0);
			session.setAttribute("Activities", act );
		}
		return "main.jsp";
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(path="/process_money", method = RequestMethod.POST)
	public String process(@RequestParam(value="building") String building,HttpSession session) {
		Random rand = new Random();
		SimpleDateFormat currentDate = new SimpleDateFormat("EEE, d MMM yyyy h:mm a");
		String date = currentDate.format(new Date());
		int gold = (int) session.getAttribute("gold");
		ArrayList<Map> activities = new ArrayList<Map>();
        activities = (ArrayList<Map>) session.getAttribute("Activities");
        Map<String,String> message = new HashMap<String,String>();
		
		int min = 0;
		int max = 0;
		switch (building) {
			case "farm" :
				min= 10;
				max= 20; break;
			case "cave" :
				min= 5;
				max= 10; break;
			case "house" :
				min= 2;
				max= 5; break;
			case "casino" :
				min= -50;
				max= 50; break;
		}
		int  number = rand.nextInt(max +1 -min) + min;
		if(number>0) {
			gold+=number;
			message.put("message","Earned "+number+" golds from the "+building+" ( "+date+" ) ");
			message.put("color", "green");
			activities.add(message);
		}
		else {
			number = Math.abs(number);
			gold-=number;
			message.put("message","Entered a casino and lost "+number+ " golds ("+date+")");
			message.put("color", "red");
			activities.add(message);
		}
		session.setAttribute("gold", gold);
		session.setAttribute("Activities", activities );
		return "redirect:/";
	}
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.removeAttribute("gold");
		session.removeAttribute("Activities");
		return "redirect:/";
	}

}
