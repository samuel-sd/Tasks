package com.ams.modern_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ams.entities.Flight;
import com.ams.modern_repository.FlightRepository;

@Service
public class FlightService {

	@Autowired
	public FlightRepository flightRepository;

	public List<Flight> getAll() {
		return flightRepository.findAll();

	}

	public void saveFlight(Flight flight) {
		flightRepository.save(flight);
	}

	public Flight getById(Long id) {
		return flightRepository.findById(id).get();
	}

	public void delete(Long id) {
		flightRepository.deleteById(id);
	}
}
