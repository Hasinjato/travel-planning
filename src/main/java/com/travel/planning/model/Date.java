package com.travel.planning.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "Date")
public class Date {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private LocalDate departureDate;
	
	private LocalDate returnDate;
	
	private Integer duration;
	
	private Boolean flexibleDate;

	public Date(Long id, LocalDate departureDate, LocalDate returnDate, Integer duration, Boolean flexibleDate) {
		super();
		this.id = id;
		this.departureDate = departureDate;
		this.returnDate = returnDate;
		this.duration = duration;
		this.flexibleDate = flexibleDate;
	}

	@Override
	public String toString() {
		return "Date [id=" + id + ", departureDate=" + departureDate + ", returnDate=" + returnDate + ", duration="
				+ duration + ", flexibleDate=" + flexibleDate + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}

	public LocalDate getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Boolean getFlexibleDate() {
		return flexibleDate;
	}

	public void setFlexibleDate(Boolean flexibleDate) {
		this.flexibleDate = flexibleDate;
	}
}
