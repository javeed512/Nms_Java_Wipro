package com.wipro.springrest.restcontroller;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.wipro.springrest.entity.Employee;

@SpringBootTest
class EmployeeRestControllerTest {
	
	
	@Autowired
	RestTemplate restTemplate;
	
	@Bean
	public RestTemplate  getRestTemplate() {
		
		
		return new RestTemplate();
		
	}
	
	

	@Test
	void testGetById() {
		
	}

	@Test
	void testCreateEmployee() {
		
		Employee emp = new Employee(135, "Virat", "Vi12", "viru@gmail.com", 4500.0);
		
	Employee e1 =		restTemplate.postForObject("http://localhost:8080/api/employees/create", emp, Employee.class);
		
					
			
	
	     assertNotNull(e1);
		
	}

}
