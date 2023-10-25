package in.peacock.peacockapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.peacock.peacockapi.models.Destination;

public interface DestinationRepository extends JpaRepository<Destination, Integer> {

}
