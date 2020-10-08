package com.ams.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity
@Table(name = "flight")
public class Flight implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

//	@ManyToOne
//	@JoinColumn(unique=true)
//	private Airline airline;

	@NotNull(message="* Is required")
	@Column(name = "number")
	private String number;

	@NotNull(message="* Is required")
	@Size(min=2,message="is required")
	@Column(name = "destination")	
	private String destination;

	@NotNull(message="* Is required")
	@Column(name = "arrival")
	private String arrival;

	@NotNull(message="* Is required")
	@Column(name = "departure")
	private String departure;

	@Column(name = "type")
	private String type;



//	public Airline getAirline() {
//		return airline;
//	}
//
//	public void setAirline(Airline airline) {
//		this.airline = airline;
//	}

	
	
	
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Flight)) {
            return false;
        }
        return id != null && id.equals(((Flight) o).id);
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Flight [id=" + id + ", number=" + number + ", destination=" + destination + ", arrival=" + arrival
				+ ", departure=" + departure + ", type=" + type + "]";
	}



}
