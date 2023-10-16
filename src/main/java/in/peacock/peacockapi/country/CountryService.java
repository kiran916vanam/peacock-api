package in.peacock.peacockapi.country;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

	@Autowired
	CountryRepository repo;

	public List<Country> getAllCountries() {
		List<Country> countries = repo.findAll();
		System.out.println(countries);
		return countries;
	}
}
