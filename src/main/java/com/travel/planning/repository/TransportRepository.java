package com.travel.planning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.planning.model.Transport;
import java.util.List;

@Repository
public interface TransportRepository extends JpaRepository<Transport, Long> {
	List<Transport> findByName(String name);

}
