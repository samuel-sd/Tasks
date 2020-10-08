//package com.ams.modern.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.ams.entities.Airline;
//import com.ams.modern_service.AirlineService;
//
//
//@Controller
//public class AmsAirlineController {
//
//	
//	
//
//	@Autowired
//	private AirlineService airlineService; 
//	
//	@RequestMapping("/airline")
//	public String viewAirlineHomePage(Model model) {
//		List<Airline> listAirline=airlineService.getAll();
//		model.addAttribute("listProducts", listAirline);
//		return "Airlineindex";
//	}
//	
//	@RequestMapping("/newAirline")
//	public String showNewAirline(Model model) {
//		Airline airline =new Airline();
//		model.addAttribute("airline", airline);
//		return "newAirlineEntry";
//	}
//	
//	@RequestMapping(value="/saveAirline",method=RequestMethod.POST)
//  public String saveAirline(@ModelAttribute("airline") Airline airline) {
//		airlineService.saveAirline(airline);
//		return "redirect:/airline";
//  }
//	
//	@RequestMapping("/editAirline/{id}")
//	public ModelAndView showEditAirline(@PathVariable(name="id") Long id) {
//	ModelAndView mav=new ModelAndView("edit_airline");
//	Airline airline=airlineService.getById(id);
//	mav.addObject("airline",airline);
//	return mav;
//	}
//	
//	@RequestMapping("/deleteAirline/{id}")
//	public String deleteAirline(@PathVariable(name="id") Long id) {
//		airlineService.delete(id);
//		return "redirect:/airline";
//		
//	}
//}
