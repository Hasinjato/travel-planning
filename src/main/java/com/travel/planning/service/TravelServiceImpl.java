package com.travel.planning.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.planning.model.Travel;
import com.travel.planning.repository.TravelRepository;

@Service
public class TravelServiceImpl {
	@Autowired
	private TravelRepository travelRepository;
	
	public List<Travel> getAllTravels() {
		return travelRepository.findAll();
	}

	public void saveTravel(Travel travel) {
		this.travelRepository.save(travel);
	}

	public Travel getTravelById(long id) {
		Optional<Travel> optional = travelRepository.findById(id);
		Travel travel;
		if (optional.isPresent()) {
			travel =  optional.get();
		} else {
			throw new RuntimeException(" Travel non trouvé :: " + id);
		}
		return travel;
	}

	public void deleteTravelById(long id) {
		this.travelRepository.deleteById(id);
	}
}
