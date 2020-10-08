package com.ams.modern.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ams.entities.Flight;
import com.ams.modern_service.FlightService;

@Controller
public class AmsFlightController {

	@Autowired
	private FlightService flightService;

	@RequestMapping("/flight")
	public String viewHomePage() {

		return "Flightindex";
	}

	@RequestMapping("/flightdata")
	public String viewFlightData(Model model) {
		List<Flight> listFlight = flightService.getAll();
		// List<Airline> listAirline = airlineService.getAll();
		// listFlight.add((Flight) listAirline);
		// listAirline.add(flight.getAirline());
		// List flightPage = new ArrayList<Airline>();
		// flightPage.addAll(listAirline);
		model.addAttribute("listFlight", listFlight);
		return "flightdata";
	}

	@RequestMapping("/newFlight")
	public String showNewFlight(Model model) {
		Flight flight = new Flight();
		model.addAttribute("flight", flight);
		return "newFlightEntry";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveFlight(@ModelAttribute("flight") @Valid Flight flight, 
			BindingResult result) {

		if (result.hasErrors()) {
			return "newFlightEntry";
		} else {
			flightService.saveFlight(flight);
			return "redirect:/flightdata";
		}
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateFlight(@ModelAttribute("flight") @Valid Flight flight, 
			BindingResult result) {

		if (result.hasErrors()) {
			return "editFlight";
		} else {
			flightService.saveFlight(flight);
			return "redirect:/flightdata";
		}
	}


//	@RequestMapping("/editFlight/{id}")
//	public ModelAndView showEditFlight(@PathVariable(name="id") Long id) {
//	ModelAndView mav=new ModelAndView("editFlight");
//	Flight flight=flightService.getById(id);
//	mav.addObject("flight",flight);
//	return mav;
//	}

	@RequestMapping("/editFlight/{id}")
	public String showEditFlight(@PathVariable(name = "id") Long id, Model model, Flight flight) {

		flight = flightService.getById(id);
		model.addAttribute("flight", flight);
		return "editFlight";
	}

	@RequestMapping("/deleteFlight/{id}")
	public String deleteFlight(@PathVariable(name = "id") Long id) {
		flightService.delete(id);
		return "redirect:/flightdata";

	}
}
