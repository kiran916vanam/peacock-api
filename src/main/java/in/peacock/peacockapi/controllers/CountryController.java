package in.peacock.peacockapi.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.peacock.peacockapi.models.Country;
import in.peacock.peacockapi.services.CountryService;

@RestController
public class CountryController {
	
	@Autowired
	CountryService service;

	@GetMapping("/countries")
	public List<Country> allCountries() {
	    return service.getAllCountries();
	}
	
	@GetMapping("/countries/serving")
	public List<Country> getServingCountries() {
	    return service.getServingCountries();
	}
	
	
	
	@PutMapping("countries/{id}")
	public Country updateCountry(@PathVariable final int id, @RequestBody final Country country) {
		return service.updateCountry(id, country);
	}
	
	@PatchMapping("/countries/{id}")
	public Country patchCountry(@PathVariable final int id, @RequestBody final Map<String, Object> countryPatch) {
		return service.patchCountry(id, countryPatch);
	}
}
