package com.wipro.springrest.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.wipro.springrest.entity.Address;
import com.wipro.springrest.entity.Employee;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class EmployeeServiceImpTest {
	
	@Autowired
	IEmployeeService  service;

	
	@Autowired
	Employee emp;
	
	
	/*
	 * @Mock Address address;
	 * 
	 * 
	 * @InjectMocks Employee employee;
	 */
	
	
	
	
	
	
	
	 
	@Test
	@Disabled
	void testInsertEmp() {

		
			emp = new Employee(131, "hussain", "Tiger","hussain@gmail.com", 8000.0);

	  Employee e1 =		service.insertEmp(emp);
		
			assertNotNull(e1);
			assertEquals(131, e1.getEid());
	  
	}

	@Test
	void testUpdateEmp() {
		
		
		
	}

	@Test
	void testGetEmployeeById() {
		
			Employee emp =	service.getEmployeeById(199);
			
			try {
				assertTrue(emp.getSalary() > 1000.0);
			}
			catch (Exception e) {
				
				assertThrows(NullPointerException.class,()->{  throw  e;});
				
			}
				
				
		
	}

	@Test
	void testGetAllEmployees() {
		
	}

}
