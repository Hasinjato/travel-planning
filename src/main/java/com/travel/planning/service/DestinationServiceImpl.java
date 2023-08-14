package com.travel.planning.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.planning.model.Destination;
import com.travel.planning.repository.DestinationRepository;
@Service
public class DestinationServiceImpl {
	@Autowired
	private DestinationRepository destinationRepository;
	
	public List<Destination> getAllDestinations() {
		return destinationRepository.findAll();
	}

	public void saveDestination(Destination destination) {
		this.destinationRepository.save(destination);
	}

	public Destination getDestinationById(long id) {
		Optional<Destination> optional = destinationRepository.findById(id);
		Destination destination;
		if (optional.isPresent()) {
			destination =  optional.get();
		} else {
			throw new RuntimeException(" destination non trouvé :: " + id);
		}
		return destination;
	}
	
	public void updateDestination(Destination destination)
	{
		if (destinationRepository.existsById(destination.getId()))
		{
			destinationRepository.save(destination);
		}
		return;
	}

	public void deleteDestinationById(long id) {
		this.destinationRepository.deleteById(id);
	}
	
	public long getNbDest() {
		return destinationRepository.count();
	}
}
