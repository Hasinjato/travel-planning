package com.travel.planning.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.travel.planning.model.Destination;

@Service
public abstract class DestinationService extends DestinationServiceImpl {
	public abstract List<Destination> getAllDestination();
	public abstract void saveDestination(Destination destination);
	public abstract Destination getDestinationById(long id);
	public abstract void deleteDestinationById(long id);
	public abstract long getNbDest();
}
