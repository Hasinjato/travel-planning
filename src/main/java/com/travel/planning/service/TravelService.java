package com.travel.planning.service;

import java.util.List;

//import java.util.List;
//import java.util.NoSuchElementException;
//
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//
//import com.travel.planning.model.Travel;
//import com.travel.planning.repository.TravelRepository;

import com.travel.planning.model.Travel;

@Service
public abstract class TravelService extends TravelServiceImpl {
	public abstract List<Travel> getAllTravels();
	public abstract void saveTravel(Travel travel);
	public abstract Travel getTravelById(long id);
	public abstract void deleteTravelById(long id);
	public abstract long getNbTravel();
}
