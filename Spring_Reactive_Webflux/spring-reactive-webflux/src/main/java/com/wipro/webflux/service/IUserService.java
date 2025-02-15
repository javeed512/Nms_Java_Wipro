package com.wipro.webflux.service;

import java.util.UUID;

import com.wipro.webflux.entity.User;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IUserService {
	
	
	public Mono<Object> createUser( User user) ;
	
	public Mono<User> updateUser(Long id, User user) ;
	
	  public Mono<User> getUserById( Long id) ;
	
	public Flux<User> getUsersByName(String name);
	
	public Flux<User> getAllUsers();
	
	

}
