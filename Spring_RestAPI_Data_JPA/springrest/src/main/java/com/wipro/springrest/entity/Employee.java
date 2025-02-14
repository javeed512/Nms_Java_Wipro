package com.wipro.springrest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
public class Employee {  // pojo or DTO or bean  or entity
	
	
	@Id
	private int eid;
	private  String ename;
	private double salary;
	
	
	
	
	
	

}
