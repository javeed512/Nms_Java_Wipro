package com.wipro.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.userservice.dto.UserDTO;
import com.wipro.userservice.entity.User;
import com.wipro.userservice.service.IUserService;
import com.wipro.userservice.vo.UserDepartmentVO;

@RestController
@RequestMapping("api/v1/users")
public class UserRestController {
	
	@Autowired
	IUserService service;
	
	@PostMapping("/add")
	public User  addUser(@RequestBody UserDTO dto) {
		
		return service.addUser(dto);
		
	}
	
	
	@GetMapping("/get/{uid}")
	public User  getUserById(@PathVariable long uid) {
		
		
		return service.getUserById(uid);
		
		
	}
	
	@GetMapping("/get-user-dept/{uid}")
	public UserDepartmentVO  getUserByIdWithDepartment(@PathVariable long uid) {
		
		
		return service.getUserByIdWithDepartment(uid);
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
