package in.peacock.peacockapi.country;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
	
	@Autowired
	CountryService service;

	@GetMapping("/countries")
	public List<Country> allCountries() {
	    return service.getAllCountries();
	}
}
