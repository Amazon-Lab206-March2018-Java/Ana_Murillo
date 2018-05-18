package com.anaroja.countries.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.anaroja.countries.repositories.CountriesRepository;

@Service
public class ApiService {
	
	private final CountriesRepository countriesRepository;
	private ApiService(CountriesRepository countriesRepository) {
		this.countriesRepository = countriesRepository;
	}
	public void findAllCountriesLanguageSlovene() {
		List <Object[]> table = countriesRepository.findAllCountriesLanguageSlovene();
		for (Object[] row : table) {
			System.out.println(row[0]);
			System.out.println(row[1]);
			System.out.println(row[2]);
		}
	}
	
	public void numberCitiesPerCountry() {
		List <Object[]> table = countriesRepository.numberCitiesPerCountry();
		for (Object[] row : table) {
			System.out.println(row[0]);
			System.out.println(row[1]);
		}
	}
	public void citiesPopulationMexico() {
		List<String> table = countriesRepository.citiesPopulationMexico();
		for (String row : table) {
			System.out.println(row);
		}
	}
	public void countryLanguagePercentageOver89() {
		List <Object[]> table = countriesRepository.countryLanguagePercentageOver89();	
		for (Object[] row : table) {
			System.out.println(row[0]);
			System.out.println(row[1]);
			System.out.println(row[2]);
		}
	}
	public void countrySurfaceAreaOver100000() {
		List <Object[]> table = countriesRepository.countrySurfaceAreaOver100000();		
		for (Object[] row : table) {
			System.out.println(row[0]);
			System.out.println(row[1]);
		}
	}
	public void countryContritutionalMonarchy() {
		List <Object[]> table = countriesRepository.countryContritutionalMonarchy();
		for (Object[] row : table) {
			System.out.println(row[0]);
			System.out.println(row[1]);
			System.out.println(row[2]);
		}
	}
	public void citiesArgentinaInBuenosAires() {
		List <Object[]> table = countriesRepository.citiesArgentinaInBuenosAires();	
		for (Object[] row : table) {
			System.out.println(row[0]);
			System.out.println(row[1]);
			System.out.println(row[2]);
			System.out.println(row[3]);
		}
	}
	public void numberCountryPerRegion() {
		List <Object[]> table = countriesRepository.numberCountryPerRegion();		
		for (Object[] row : table) {
			System.out.println(row[0]);
			System.out.println(row[1]);
		}
	}
}
