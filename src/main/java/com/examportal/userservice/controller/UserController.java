package com.examportal.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examportal.userservice.model.User;
import com.examportal.userservice.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/")
	public User createUser(@RequestBody User user) throws Exception {
		return this.userService.createUser(user);
	}
	
	@GetMapping("/{id}")
	public User getUserById(@PathVariable("id") Long id) {
		return this.userService.getUserById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable("id") long id) {
		this.userService.deleteUser(id);
	}
	
}
