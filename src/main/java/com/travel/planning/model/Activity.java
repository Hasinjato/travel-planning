package com.travel.planning.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Activity")
public class Activity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	private String timeOpening;
	
	private Double cost;
	
	private Boolean needReservation;
	
	private Integer duration;

	public Activity(Long id, String name, String timeOpening, Double cost, Boolean needReservation, Integer duration) {
		super();
		this.id = id;
		this.name = name;
		this.timeOpening = timeOpening;
		this.cost = cost;
		this.needReservation = needReservation;
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Activity [id=" + id + ", name=" + name + ", timeOpening=" + timeOpening + ", cost=" + cost
				+ ", needReservation=" + needReservation + ", duration=" + duration + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTimeOpening() {
		return timeOpening;
	}

	public void setTimeOpening(String timeOpening) {
		this.timeOpening = timeOpening;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public Boolean getNeedReservation() {
		return needReservation;
	}

	public void setNeedReservation(Boolean needReservation) {
		this.needReservation = needReservation;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}
}
