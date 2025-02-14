package com.hexaware.springrestjpa.restcontroller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import com.hexaware.springrestjpa.entities.Employee;

@SpringBootTest
class EmployeeRestControllerTest2 {
	
	
	@Autowired
	RestTemplate restTemplate;
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void testInsertEmployee() {


			
		
		
		
		
	}

	@Test
	void testUpdateEmployee() {
	
	}

	@Test
	void testGetEmployeeById() {
		
		
			//restTemplate.getForEntity(null, null);
		
			int eid = 101;
			
		Employee emp =	restTemplate.getForObject("http://localhost:8080/api/employees/get/"+eid, Employee.class);
		
				System.out.println(emp);
				
				assertNotNull(emp);
		
		
	}

	@Test
	void testGetAll() {
		
	}

	@Test
	void testDeleteById() {
		
	}

}
