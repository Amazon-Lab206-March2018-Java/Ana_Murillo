package com.anaroja.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.anaroja.web.models.Cat;
import com.anaroja.web.models.Dog;

/**
 * Servlet implementation class Show
 */
@WebServlet("/Show")
public class Show extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Show() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Process request
		int Animal = Integer.parseInt(request.getParameter("Animal"));
        String Name = request.getParameter("Name");
        String Breed = request.getParameter("Breed");
        int Weight = Integer.parseInt(request.getParameter("Weight"));
    	System.out.println(Animal);
        if (Animal == 1) {
        	System.out.println("cat");
        	Cat newCat = new Cat(Name,Breed,Weight);
            request.setAttribute("affection", newCat.showAffection() );
            RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/Cat.jsp");
            view.forward(request, response);
        }
        if (Animal == 2) {
        	System.out.println("dog");
        	Dog newDog = new Dog(Name,Breed,Weight);
            request.setAttribute("affection", newDog.showAffection());
            RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/Dog.jsp");
            view.forward(request, response);
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
