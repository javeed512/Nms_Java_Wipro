package com.wipro.springrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wipro.springrest.entity.Employee;

@SpringBootApplication
public class SpringrestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringrestApplication.class, args);
		
		
		Employee emp = new Employee(1, "tom", 4000);
		
		emp.setEname(null);
				
		
	}

}
