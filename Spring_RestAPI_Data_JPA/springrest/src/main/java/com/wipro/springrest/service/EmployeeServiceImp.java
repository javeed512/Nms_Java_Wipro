package com.wipro.springrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.wipro.springrest.entity.Employee;
import com.wipro.springrest.repositoy.EmployeeRepository;

@Service
public class EmployeeServiceImp implements IEmployeeService {

	
		@Autowired
		EmployeeRepository repo;
	
	
	@Override
	public Employee insertEmp(Employee emp) {
		
		return   repo.save(emp);
	}

	@Override
	public Employee updateEmp(Employee emp) {
		
		return   repo.save(emp);
	}

	@Override
	public Employee getEmployeeById(int eid) {
		
		return  repo.findById(eid).orElse(null);
	}

	@Override
	public ResponseEntity<String> deleteEmployeeById(int eid) {


		repo.deleteById(eid);
		
		return   new ResponseEntity<String>("Record Deleted Successfully",HttpStatus.OK);
	
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return  repo.findAll();
	}

}
