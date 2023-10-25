package in.peacock.peacockapi.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.peacock.peacockapi.models.Destination;
import in.peacock.peacockapi.services.DestinationService;

@RestController
public class DestinationController {
	
	@Autowired
	DestinationService service;

	@GetMapping("/destinations")
	public List<Destination> getDestinations() {
	    return service.getDestinations();
	}
	
	@PostMapping("/destinations")
	public Destination postDestination(@RequestBody final Destination destination) {
	    return service.postDestination(destination);
	}
	
	@PutMapping("destinations/{id}")
	public Destination updateDestination(@PathVariable final int id, @RequestBody final Destination destination) {
		return service.updateDestination(id, destination);
	}
	
	@PatchMapping("/destinations/{id}")
	public Destination patchDestination(@PathVariable final int id, @RequestBody final Map<String, Object> destinationPatch) {
		return service.patchDestination(id, destinationPatch);
	}
}
