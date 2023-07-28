package com.travel.planning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@EnableWebSecurity
@SpringBootApplication
public class TravelPlanningApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravelPlanningApplication.class, args);
		
		String pass = "admin";
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String hashedP = encoder.encode(pass);
		System.out.println("Voici le pass hashed " + hashedP);
	}
	
}
