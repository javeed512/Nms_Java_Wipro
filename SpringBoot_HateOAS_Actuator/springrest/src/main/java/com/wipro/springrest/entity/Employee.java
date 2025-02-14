package com.wipro.springrest.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Component
public class Employee {  // pojo or DTO or bean  or entity
	
	
	@Id
	@Min(value = 100)
	@Max(value= 999)
	private int eid;
	
	@NotNull
	@NotBlank
	private  String ename;
	
	@Pattern(regexp = "[A-Z][a-z0-9]{4}")
	private  String password;
	
	@Email
	private String email;
	
	
	@DecimalMin(value = "1000.0")
	@DecimalMax(value ="10000.0")
	private double salary;
	
	
	
	
	
	

}
