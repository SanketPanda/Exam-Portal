package com.examportal.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examportal.userservice.model.User;
import com.examportal.userservice.repositary.UserRepositary;

@Service
public class UserService {

	@Autowired
	UserRepositary userRepositary;
	
	public User createUser(User user) throws Exception {
		User localUser = this.userRepositary.findByEmail(user.getEmail());
		
		if(localUser != null) {
			throw new Exception("User already present with email - "+localUser.getEmail());
		}else {
			localUser = userRepositary.save(user);
		}
		return localUser;
	}
	
	public User getUserByUserName(String userName) {
		return this.userRepositary.findByUsername(userName);
	}
	
	public User getUserById(Long id) {
		return this.userRepositary.findById(id).get();
	}
	
	public void deleteUser(Long id) {
		userRepositary.deleteById(id);
	}
	
}
