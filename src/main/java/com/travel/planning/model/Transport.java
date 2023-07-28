package com.travel.planning.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//import java.time.LocalDateTime;

@Entity
@Table(name = "Transport")
public class Transport {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "company")
	private String company;

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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Transport [id=" + id + ", name=" + name + ", company=" + company + "]";
	}

	public Transport(Long id, String name, String company) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
	}

	public Transport() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
