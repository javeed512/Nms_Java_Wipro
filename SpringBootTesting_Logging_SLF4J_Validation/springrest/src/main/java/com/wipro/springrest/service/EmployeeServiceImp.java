package com.wipro.springrest.service;

import java.util.List;

import org.hibernate.query.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.springrest.entity.Employee;
import com.wipro.springrest.repositoy.EmployeeRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Transactional
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
		
		log.info("employee data fetch from db to service");
		
		return  repo.findById(eid).orElse(null);
	}

	@Override
	public ResponseEntity<String> deleteEmployeeById(int eid) {


		//Employee emp = repo.findById(eid).orElse(null);
		
		//repo.delete(emp);
		
		repo.deleteById(eid);
		
		return   new ResponseEntity<String>("Record Deleted Successfully",HttpStatus.OK);
	
	}
	
	public static boolean   validateInputData(Employee emp) {
		
		boolean flag = false;
		
		if(emp.getEid() > 0 && emp.getEname().length() > 4 && emp.getSalary() > 5000) {
			
			flag = true;
			
			
		}
		
		return flag;
	}
	
	

	@Override
	public List<Employee> getAllEmployees() {
		
		//return  repo.findAll();
		
		return  repo.findAll(Sort.by("ename"));
	}

	@Override
	public Employee getByEname(String ename) {
		
		return repo.findByEname(ename);
	}

	@Override
	public List<Employee> findBySalaryGreaterThan(double salary) {


		
		return repo.findBySalaryGreaterThan(salary);
	}

	@Override
	public List<Employee> getAllFilterBySalary(double min, double max) {
	
		return repo.getAllFilterBySalary(min, max);
	}

	@Override
	public void deleteByEname(String ename) {
		
		 repo.deleteByEname(ename);
	}

}
