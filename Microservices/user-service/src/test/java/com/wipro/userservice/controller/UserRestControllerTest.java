package com.wipro.userservice.controller;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import com.wipro.userservice.entity.User;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class UserRestControllerTest {

		@Autowired
		RestTemplate restTemplate;
	
	
	@Test
	void testAddUser() {
		
		User userRequest = new User();
		
			userRequest.setUsername("Tommy");
			userRequest.setEmail("tommy@gmail.com");
			userRequest.setDepartmentId(4);
			
		
	User user =	restTemplate.postForObject("http://localhost:8282/api/v1/users/add", userRequest, User.class);
		
		assertNotNull(user);
	
	}

	@Test
	void testGetUserById() {
		
		long userId = 3;
		
	User user =	restTemplate.getForObject("http://localhost:8282/api/v1/users/get/"+userId, User.class);
		
		//log.debug("user "+user);
	
		assertNotNull(user);
	
		
	}

}
