package in.peacock.peacockapi.country;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ReflectionUtils;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

	@Autowired
	CountryRepository repo;

	public List<Country> getAllCountries() {
		return repo.findAll();
	}

	public List<Country> getServingCountries() {
		return repo.findByNotServing(0);
	}
	
	public List<Country> getNonServingCountries() {
		return repo.findByNotServing(1);
	}

	public Country updateCountry(int id, Country country) {
		Optional<Country> tempCountry = repo.findById(id);

		if(tempCountry.isEmpty())
			throw new RuntimeException("Country with id {"+ id +"} not found");

		country.setId(id);
		return repo.save(country);
	}

	public Country patchCountry(final int id, Map<String, Object> countryPatch) {
		Optional<Country> tempCountry = repo.findById(id);

		if(tempCountry.isEmpty())
			throw new RuntimeException("Country with id {"+ id +"} not found");
		
		countryPatch.forEach((key, value) -> {
			Field field = ReflectionUtils.findField(Country.class, key);
			ReflectionUtils.makeAccessible(field);
			ReflectionUtils.setField(field, tempCountry.get(), value);
		});

		return repo.save(tempCountry.get());
	}
}
