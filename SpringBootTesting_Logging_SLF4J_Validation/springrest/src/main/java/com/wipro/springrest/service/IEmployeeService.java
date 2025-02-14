package com.wipro.springrest.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.wipro.springrest.entity.Employee;

public interface IEmployeeService {
	
	
	
	
		public Employee   insertEmp(Employee emp);
		public Employee   updateEmp(Employee emp);
	
		
		public  Employee  getEmployeeById(int eid);
		public   ResponseEntity<String>  deleteEmployeeById(int eid);
		
		public     List<Employee>   getAllEmployees();
		
		 public 	 Employee	  getByEname(String ename);
		 
		 public List<Employee> findBySalaryGreaterThan(double salary);
		 
		 public  List<Employee>  getAllFilterBySalary(double min , double max);
		 
		 public  void  deleteByEname(String ename);
	

}
