package com.wipro.springsecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.wipro.springsecurity.entity.UserEntity;
import com.wipro.springsecurity.repository.UserRepository;

@Service
public class MyUserDetailsServiceImp implements UserDetailsService {

		@Autowired
		UserRepository  repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

				UserEntity user =			repo.findByUsername(username);
		
					if(user == null) {
						
						
						throw new  UsernameNotFoundException("User Not Found");
						
					}
				
				
		
		
		return  new  UserDetailsImp(user);
	}

}
