package com.ams.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
//
//@Entity
//@Table(name="airline")
//public class Airline implements Serializable{
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@Column(name="id")
//	private Long id;
//	
//	@Column(name="airlineName")
//	private String airlineName;
//
//	@JsonIgnore
//	@OneToMany(mappedBy="airline",cascade={CascadeType.REMOVE})
//	List<Flight> flightDetails;
//
//	
//	
//	
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getAirlineName() {
//		return airlineName;
//	}
//
//	public void setAirlineName(String airlineName) {
//		this.airlineName = airlineName;
//	}
//
//	public List<Flight> getFlightDetails() {
//		return flightDetails;
//	}
//
//	public void setFlightDetails(List<Flight> flightDetails) {
//		this.flightDetails = flightDetails;
//	}
//
//	
//	   @Override
//	    public boolean equals(Object o) {
//	        if (this == o) {
//	            return true;
//	        }
//	        if (!(o instanceof Airline)) {
//	            return false;
//	        }
//	        return id != null && id.equals(((Airline) o).id);
//	    }
//	   
//	@Override
//	public String toString() {
//		return "Airline [id=" + id + ", airlineName=" + airlineName + ", flightDetails=" + flightDetails + "]";
//	}

//}
