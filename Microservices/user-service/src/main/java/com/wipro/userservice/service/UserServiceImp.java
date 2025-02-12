package com.wipro.userservice.service;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.wipro.userservice.dto.UserDTO;
import com.wipro.userservice.entity.User;
import com.wipro.userservice.repository.UserRepository;
import com.wipro.userservice.vo.Department;
import com.wipro.userservice.vo.UserDepartmentVO;

import lombok.extern.slf4j.Slf4j;

@Service

public class UserServiceImp implements IUserService {

	@Autowired
	UserRepository repo;
	
	@Autowired
	RestTemplate restTemplate;
	

	

	@Override
	public User addUser(UserDTO dto) {

		User user = new User(); // entity object
		user.setUserId(dto.getUserId());
		user.setUsername(dto.getUsername());
		user.setEmail(dto.getEmail());
		user.setDepartmentId(dto.getDepartmentId());

		return repo.save(user);
	}

	@Override
	public User getUserById(long uid) {
		// TODO Auto-generated method stub
		return repo.findById(uid).orElse(new User());
	}

	@Override
	public UserDepartmentVO getUserByIdWithDepartment(long uid) {
		
		User user =	 getUserById(uid);
				//repo.findById(uid).orElse(null);
		
			long deptId =		user.getDepartmentId();
			
		//	log.debug("deptid "+deptId);
			
		
			
		
ResponseEntity<Department>  response 
 =   restTemplate.getForEntity("http://DEPARTMENT-SERVICE/api/v1/department/get/"+deptId, Department.class);
	
Department department = response.getBody();



	



	//Department department1 =		restTemplate.getForObject("http://localhost:8181/api/v1/department/get/"+deptId, Department.class);


	
	

	//log.debug("dept "+department);
	
		UserDepartmentVO   userDepartment = new UserDepartmentVO(user, department);

		return userDepartment;
	}
	
	
	
	
	
	
	
	

}
