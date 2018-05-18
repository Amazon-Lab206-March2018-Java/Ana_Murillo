package com.anaroja.countries.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.anaroja.countries.services.ApiService;

@Controller
public class WorldController {

	private final ApiService apiService;
	public WorldController(ApiService apiService) {
		this.apiService = apiService;
	}
	
	@RequestMapping("/")
	public String index() {
//		apiService.findAllCountriesLanguageSlovene();
//		System.out.println("-------------------------------------");
//		apiService.numberCitiesPerCountry();
//		System.out.println("-------------------------------------");
//		apiService.citiesPopulationMexico();
//		System.out.println("-------------------------------------");
//		apiService.countryLanguagePercentageOver89();
//		System.out.println("-------------------------------------");
//		apiService.countrySurfaceAreaOver100000();
//		System.out.println("-------------------------------------");
//		apiService.countryContritutionalMonarchy();
		System.out.println("-------------------------------------");
		apiService.citiesArgentinaInBuenosAires();
		System.out.println("-------------------------------------");
		apiService.numberCountryPerRegion();
		System.out.println("-------------------------------------");
		return "index.jsp";
	}
}
