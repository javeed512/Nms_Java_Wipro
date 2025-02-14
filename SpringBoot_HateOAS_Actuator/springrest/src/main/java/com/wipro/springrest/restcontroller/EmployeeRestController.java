package com.wipro.springrest.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.springrest.entity.Employee;
import com.wipro.springrest.exception.EmployeeNotFoundException;
import com.wipro.springrest.service.EmployeeServiceImp;
import com.wipro.springrest.service.IEmployeeService;

import jakarta.validation.constraints.Min;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {

	@Autowired
	IEmployeeService service;

	@GetMapping("/getbyid/{eid}")
	public Employee getById(@Min(value = 1) @PathVariable int eid) throws EmployeeNotFoundException {

		Employee emp =   service.getEmployeeById(eid);
		
		
		if(emp != null) {
			
			return emp;
			
		}
		else {
			
			throw  new  EmployeeNotFoundException();
			
		}
		
	}

	
	@GetMapping("/getbyename/{ename}")
	public Employee getByEname(@PathVariable String ename) {

		return service.getByEname(ename);
	}
	
	
	@GetMapping("/get/gt-salary/{sal}")
	public List<Employee> getSalaryGT(@PathVariable  double sal) {

		return service.findBySalaryGreaterThan(sal);
	}
	
	
	@GetMapping("/getbysalaries/{min}/{max}")
	public List<Employee> getAllBySalaries(@PathVariable  double min , @PathVariable double max) {

		return service.getAllFilterBySalary(min, max);
	}
	
	
	
	@PostMapping("/create")
	public Employee createEmployee(@RequestBody Employee emp) {

		/*
		 * Employee e1 = null;
		 * 
		 * boolean isValid = EmployeeServiceImp.validateInputData(emp);
		 * 
		 * if(isValid) { e1 = service.insertEmp(emp); }
		 * 
		 * 
		 * return e1;
		 */

		
		return service.insertEmp(emp);
		
	}

	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee emp) {

		return service.updateEmp(emp);

	}

	@DeleteMapping("/deletebyid/{eid}")
	public ResponseEntity<String> deleteById(@PathVariable int eid) {

		return service.deleteEmployeeById(eid);

	}
	
	
	@GetMapping("/getall")
	public List<Employee> getAllEmployees() {

		return service.getAllEmployees();
	}
	
	
	
	@DeleteMapping("/deletebyename/{ename}")
	public String deleteByEname(@PathVariable String ename) {

		 service.deleteByEname(ename);
		 
		 return "Delete Mapping executed..";

	}
	
	
	
	
	
	
	

}
