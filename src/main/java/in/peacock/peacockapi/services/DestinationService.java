package in.peacock.peacockapi.services;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ReflectionUtils;

import in.peacock.peacockapi.models.Destination;
import in.peacock.peacockapi.repositories.DestinationRepository;

import org.springframework.stereotype.Service;

@Service
public class DestinationService {

	@Autowired
	DestinationRepository repo;

	public List<Destination> getDestinations() {
		return repo.findAll();
	}
	
	public Destination postDestination(final Destination destination) {
		return repo.save(destination);
	}

	public Destination updateDestination(int id, Destination destination) {
		Optional<Destination> tempDestination = repo.findById(id);

		if(tempDestination.isEmpty())
			throw new RuntimeException("Destination with id {"+ id +"} not found");

		destination.setId(id);
		return repo.save(destination);
	}

	public Destination patchDestination(final int id, Map<String, Object> destinationPatch) {
		Optional<Destination> tempDestination = repo.findById(id);

		if(tempDestination.isEmpty())
			throw new RuntimeException("Destination with id {"+ id +"} not found");
		
		destinationPatch.forEach((key, value) -> {
			Field field = ReflectionUtils.findField(Destination.class, key);
			ReflectionUtils.makeAccessible(field);
			ReflectionUtils.setField(field, tempDestination.get(), value);
		});

		return repo.save(tempDestination.get());
	}
}
