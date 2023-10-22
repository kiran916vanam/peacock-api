package in.peacock.peacockapi.country;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Integer> {

	public List<Country> findByNotServing(int flag);

}
