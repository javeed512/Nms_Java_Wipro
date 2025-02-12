package com.wipro.userservice.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.wipro.userservice.dto.UserDTO;
import com.wipro.userservice.entity.User;
import com.wipro.userservice.vo.Department;
import com.wipro.userservice.vo.UserDepartmentVO;

@Disabled
@SpringBootTest
class UserServiceImpTest {
	
	// now autowired service class obj
	@Autowired
	IUserService  service;

	@Disabled
	@Test
	void testAddUser() {
		
		
		
		// here we will test addUser()
		
			UserDTO  user1 = new UserDTO();
					user1.setUsername("Rahul");	
					user1.setEmail("rahul@gmail.com");
					user1.setDepartmentId(4);
		
	User user =	service.addUser(user1);
	
		assertEquals("Rahul", user.getUsername());
		
		assertTrue(user.getUserId() >0);
		
		
	}

	@Test
	void testGetUserById() {
		
		
	User user =	service.getUserById(3);
		
		assertNotNull(user);
	
	}

	@Test
	void testGetUserByIdWithDepartment() {
		
		UserDepartmentVO userDept =		service.getUserByIdWithDepartment(4);
		
	Department dept =	userDept.getDepartment();
		
		assertNotEquals("Development", dept.getDepartmentName());
		
	}

}
