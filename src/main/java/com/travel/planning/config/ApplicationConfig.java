package com.travel.planning.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.travel.planning")
public class ApplicationConfig {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ApplicationConfig.class, args);
	}

}
