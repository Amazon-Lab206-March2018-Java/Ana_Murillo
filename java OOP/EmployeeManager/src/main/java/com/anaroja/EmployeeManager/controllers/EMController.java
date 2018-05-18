package com.anaroja.EmployeeManager.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.anaroja.EmployeeManager.models.EMModel;
import com.anaroja.EmployeeManager.services.EMService;

@Controller
public class EMController {
	
	private final EMService emService;
	
	public EMController(EMService emService) {
		this.emService = emService;
	}
	
	@RequestMapping ("/")
	public void index() {
		EMModel man1 = new EMModel("Alex","Chavarria");
		EMModel emp1 = new EMModel("Javier","Villalobos");
		EMModel emp2 = new EMModel("Victor","Chanto");
		List<EMModel> employees = new ArrayList<EMModel>();
		employees.add(emp1);
		employees.add(emp2);
		man1.setEmployees(employees);
		emp1.setManager(man1);
		emp2.setManager(man1);
		emService.createEmployee(man1);
		emService.createEmployee(emp1);
		emService.createEmployee(emp2);
		System.out.println("Employees");
		for (EMModel employee : man1.getEmployees()) {
			System.out.println(employee.getFirstName() + " " + employee.getLastName());
		}
		System.out.println("Manager");
		System.out.println(emp1.getManager().getFirstName() + " " + emp1.getManager().getLastName());
	}

}
