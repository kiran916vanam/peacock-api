package in.peacock.peacockapi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.peacock.peacockapi.models.Country;

public interface CountryRepository extends JpaRepository<Country, Integer> {

	public List<Country> findByNotServing(int flag);

}
