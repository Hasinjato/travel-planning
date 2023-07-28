package com.travel.planning.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Entity
@Table(name = "Travel")
public class Travel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "destination")
	private String destination;
	
	@Column(name = "startDate")
	private String startDate;
	
	@Column(name = "endDate")
	private String endDate;

	@Column(name = "description")
	private String description;
	
	@Column(name = "transport")
	private String transport;
	
	@Column(name = "travelerName")
	private String travelerName;
	
	@Column(name = "travelerEmail")
	private String travelerEmail;
	
	@Column(name = "travelerPhone")
	private String travelerPhone;
	
	

	@Override
	public String toString() {
		return "Travel [id=" + id + ", destination=" + destination + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", description=" + description + ", transport=" + transport + ", travelerName=" + travelerName
				+ ", travelerEmail=" + travelerEmail + ", travelerPhone=" + travelerPhone + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

		
	public String getTransport() {
		return transport;
	}

	public void setTransport(String transport) {
		this.transport = transport;
	}

	public String getTravelerName() {
		return travelerName;
	}

	public void setTravelerName(String travelerName) {
		this.travelerName = travelerName;
	}

	public String getTravelerEmail() {
		return travelerEmail;
	}

	public void setTravelerEmail(String travelerEmail) {
		this.travelerEmail = travelerEmail;
	}

	public String getTravelerPhone() {
		return travelerPhone;
	}

	public void setTravelerPhone(String travelerPhone) {
		this.travelerPhone = travelerPhone;
	}

	
	public Travel(Long id, String destination, String startDate, String endDate, String description, String transport,
			String travelerName, String travelerEmail, String travelerPhone) {
		super();
		this.id = id;
		this.destination = destination;	
		this.startDate = startDate;
		this.endDate = endDate;
		
		this.description = description;
		this.transport = transport;
		this.travelerName = travelerName;
		this.travelerEmail = travelerEmail;
		this.travelerPhone = travelerPhone;
	}

	public Travel() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
