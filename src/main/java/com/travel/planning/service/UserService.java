package com.travel.planning.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.travel.planning.model.User;
import com.travel.planning.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {
	User save(UserRegistrationDto registrationDto); 
}
