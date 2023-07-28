package com.travel.planning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
import com.travel.planning.model.User;

 
//@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
