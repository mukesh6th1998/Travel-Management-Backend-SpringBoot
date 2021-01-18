

package com.example.model;

import javax.persistence.Entity;


import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Travels {
	
	@Id
	@GeneratedValue 
	private Integer id;

	private String name;
	private String start_date;
	private String end_date;
	private String departure_country;
	private String destination_country;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	public String getDeparture_country() {
		return departure_country;
	}
	public void setDeparture_country(String departure_country) {
		this.departure_country = departure_country;
	}
	public String getDestination_country() {
		return destination_country;
	}
	public void setDestination_country(String destination_country) {
		this.destination_country = destination_country;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
}
