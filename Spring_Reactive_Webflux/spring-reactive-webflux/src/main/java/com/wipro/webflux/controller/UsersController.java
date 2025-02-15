package com.wipro.webflux.controller;

import java.time.Duration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.webflux.entity.User;
import com.wipro.webflux.service.IUserService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/users")
public class UsersController {
	
	@Autowired
	IUserService service;
	
	
	 @GetMapping("/getall")
	    public Flux<User> getAllUsers() {
	        return service.getAllUsers();
	    }

	    @GetMapping("/getbyid/{id}")
	    public Mono<User> getUserById(@PathVariable Long id) {
	        return service.getUserById(id);
	    }

	    @PostMapping("/create")
	    public Mono<User> createUser(@RequestBody User user) {
	        return  service.createUser(user);
	    }

	    @GetMapping("/name/{name}")
	    public Flux<User> getUsersByName(@PathVariable String name) {
	        return service.getUsersByName(name);
	    }
	
	
	

}
