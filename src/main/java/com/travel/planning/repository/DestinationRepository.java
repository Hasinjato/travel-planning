package com.travel.planning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travel.planning.model.Destination;
import java.util.List;


public interface DestinationRepository extends JpaRepository<Destination, Long> {
	List<Destination> findByName(String name);
//	List<Travel> findById(Long id);
}
