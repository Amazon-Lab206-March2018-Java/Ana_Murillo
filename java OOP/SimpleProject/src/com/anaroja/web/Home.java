package com.anaroja.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				// get the value for the query parameter
		        String FirstName = "Unknown";
		        String LastName = "Unknown";
		        String Language = "Unknown";
		        String HomeTown = "Unknown";
		        
		        
		        if(request.getParameter("name") != null) {
		        	FirstName = request.getParameter("name");
		        }
		        if(request.getParameter("last") != null) {
		        	LastName = request.getParameter("last");
		        }
		        if(request.getParameter("lang") != null) {
		        	Language = request.getParameter("lang");
		        }
		        if(request.getParameter("home") != null) {
		        	HomeTown = request.getParameter("home");
		        }
		        
				response.setContentType("text/html");
				// writes the response
				PrintWriter out = response.getWriter();
				out.write("<h1>Welcome " + FirstName + LastName + "</h1>");
				out.write("<h2>Your favorite language is: " + Language + "</h2>");
				out.write("<h2>Your hometownn is: " + HomeTown + "</h2>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
