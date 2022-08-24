package com.cassandara.spring.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cassandara.spring.model.User;
import com.cassandara.spring.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@PostConstruct
	public void saveUser() {
		List<User> users = new ArrayList<>();
		users.add(new User(3,"Turan","Turkey,Cankaya", 24));
		users.add(new User(4,"Ekin","Germany", 24));
		users.add(new User(5,"Shahrzad","iran, tehran", 24));
		userRepository.saveAll(users);
	}
	
	@GetMapping("/getAllUsers")
	public String findUsers() {
		return userRepository.findAll().toString();
		
	}
}
