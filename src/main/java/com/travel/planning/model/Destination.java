package com.travel.planning.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Destination")
public class Destination {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;
	
	private String country;
	
	private String city;
	
	private String attraction;
	
	private Long duration;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Destination [id=" + id + ", name=" + name + ", countries=" + country + ", city=" + city
				+ ", attraction=" + attraction + ", duration=" + duration + "]";
	}

	public Destination() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Destination(Long id, String name, String country, String city, String attraction, Long duration) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
		this.city = city;
		this.attraction = attraction;
		this.duration = duration;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountries() {
		return country;
	}

	public void setCountries(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAttraction() {
		return attraction;
	}

	public void setAttraction(String attraction) {
		this.attraction = attraction;
	}

	public Long getDuration() {
		return duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}
}
