package com.nagarro.microservices.userservice.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.ImmutableList;
import com.nagarro.microservices.userservice.Configuration;



@RestController
@RequestMapping("/admin")
public class UserServiceController {

	
	@Autowired
	Configuration configuration;
	
	
	
	@GetMapping("/user")
	public String getOrderTest() {
		
		return "Welcome To Output Screen Of My Mini Spring Boot Project";
	}

	
	
	
	

}

