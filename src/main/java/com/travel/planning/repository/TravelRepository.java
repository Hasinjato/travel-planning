package com.travel.planning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travel.planning.model.Travel;

//import java.util.Date;
//import java.util.List;


public interface TravelRepository extends JpaRepository<Travel, Long> {
//	List<Travel> findByStartDate(Date startDate);
//	List<Travel> findById(Long id);
}
