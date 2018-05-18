package com.anaroja.countries.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.anaroja.countries.models.Country;

@Repository
public interface CountriesRepository extends CrudRepository<Country, Long> {

	@Query(value="SELECT c.name, l.language, l.percentage FROM countries c join languages l on c.id = l.country_id WHERE l.language = 'Slovene' ORDER BY l.percentage DESC",nativeQuery=true)
	List<Object[]> findAllCountriesLanguageSlovene();
	
	@Query(value="SELECT c.name, count(c2.name) as number_city FROM countries c join cities c2 on c.id = c2.country_id ORDER BY number_city DESC ",nativeQuery=true)
	List<Object[]> numberCitiesPerCountry();
	
	@Query(value="SELECT c2.name FROM countries c join cities c2 on c.id = c2.country_id WHERE c.name = 'Mexico' AND c2.population > 500000 ORDER BY c2.population DESC ",nativeQuery=true)
	List<String> citiesPopulationMexico();
	
	@Query(value="SELECT c.name, l.language, l.percentage FROM countries c join languages l on c.id = l.country_id WHERE l.percentage > 89 ORDER BY l.percentage DESC ",nativeQuery=true)
	List<Object[]> countryLanguagePercentageOver89();
	
	@Query(value="SELECT c.name, c.surface_area FROM countries c WHERE c.population > 100000 AND c.surface_area < 501",nativeQuery=true)
	List<Object[]> countrySurfaceAreaOver100000();
	
	@Query(value="SELECT c.name, c.surface_area, c.life_expectancy FROM countries c WHERE c.government_form = 'Constitutional Monarchy' AND c.surface_area > 200 AND c.life_expectancy > 75 ",nativeQuery=true)
	List<Object[]> countryContritutionalMonarchy();
	
	@Query(value="SELECT c.name as name_country , c2.name as name_city, c2.district, c2.population FROM countries c join cities c2 on c.id = c2.country_id WHERE c2.district = 'Buenos Aires' AND c2.population > 500000 " ,nativeQuery=true)
	List<Object[]> citiesArgentinaInBuenosAires();
	
	@Query(value="SELECT count(c.name) as country_number, c.region FROM countries c ORDER BY country_number DESC " ,nativeQuery=true)
	List<Object[]> numberCountryPerRegion();	
}
