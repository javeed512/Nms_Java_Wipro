package com.wipro.springsecurity.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
	
	
				@GetMapping("/hello")
				
			public String    getMessage() {
				
				return "Hello friends";
				
			}
	

}
