package com.travel.planning.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Accommodation")
public class Accommodation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String type;
	
	private String name;
	
	private String address;
	
	private String amenities;
	
	private Date reservation;
	
	private Double cost;

	public Accommodation(Long id, String type, String name, String address, String amenities, Date reservation,
			Double cost) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
		this.address = address;
		this.amenities = amenities;
		this.reservation = reservation;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Accommodation [id=" + id + ", type=" + type + ", name=" + name + ", address=" + address + ", amenities="
				+ amenities + ", reservation=" + reservation + ", cost=" + cost + "]";
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAmenities() {
		return amenities;
	}

	public void setAmenities(String amenities) {
		this.amenities = amenities;
	}
	
	public Date getReservation() {
		return reservation;
	}

	public void setReservation(Date reservation) {
		this.reservation = reservation;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}
}
