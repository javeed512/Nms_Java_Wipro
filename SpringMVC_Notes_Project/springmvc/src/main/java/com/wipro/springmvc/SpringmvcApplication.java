package com.wipro.springmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.wipro.springmvc.beans.Employee;

@SpringBootApplication
public class SpringmvcApplication {

	public static void main(String[] args) {
		
  ApplicationContext context =		SpringApplication.run(SpringmvcApplication.class, args);
  
  
  			Employee emp =			context.getBean(Employee.class);
  
  				System.out.println(emp);
  			
  
	}

}
