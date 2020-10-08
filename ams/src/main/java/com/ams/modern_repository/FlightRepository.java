package com.ams.modern_repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.ams.entities.Flight;

public interface FlightRepository extends JpaRepository<Flight,Long> {

//	public Flight findByFlightId(@Param("id") Flight id); 
	
}
