package com.examportal.userservice.model;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

	private long id;
	private String email;
	private String fullName;
	private String userName;
	private String password;
	private boolean enabled;
	
	
}
