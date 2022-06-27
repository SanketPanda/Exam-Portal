package com.examportal.userservice.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examportal.userservice.model.User;

@Repository
public interface UserRepositary extends JpaRepository<User, Long>{

	User findByEmail(String email);
	User findByUsername(String userName);
	
}
