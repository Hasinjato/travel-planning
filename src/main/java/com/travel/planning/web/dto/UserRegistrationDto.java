package com.travel.planning.web.dto;


public class UserRegistrationDto {
	private String full_name;
	private String username;
	private String password;
	
	public UserRegistrationDto() {
		// TODO Auto-generated constructor stub
	}
	
	public UserRegistrationDto(String full_name, String username, String password) {
		super();
		this.full_name = full_name;
		this.username = username;
		this.password = password;
	}
	
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
