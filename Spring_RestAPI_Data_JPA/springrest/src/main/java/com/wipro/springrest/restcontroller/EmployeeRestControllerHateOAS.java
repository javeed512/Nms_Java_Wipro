package com.wipro.springrest.restcontroller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.springrest.entity.Employee;
import com.wipro.springrest.service.IEmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestControllerHateOAS {
	
	
	
	@Autowired
	IEmployeeService  employeeService;
	
	
	@PostMapping
    public EntityModel<Employee> createEmployee(@RequestBody Employee employee) {
        Employee createdEmployee = employeeService.insertEmp(employee);
        return toHateoasEntityModel(createdEmployee);
    }

    @GetMapping("/{id}")
    public EntityModel<Employee> getEmployee(@PathVariable int id) {
        Employee employee = employeeService.getEmployeeById(id);
        return toHateoasEntityModel(employee);
    }
    
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
    
    
    @PutMapping
    public EntityModel<Employee> updateEmployee( @RequestBody Employee emp) {
        Employee updatedEmployee = employeeService.updateEmp(emp);
        return toHateoasEntityModel(updatedEmployee);
    }
    
	
    private EntityModel<Employee> toHateoasEntityModel(Employee employee) {
        Link selfLink = linkTo(methodOn(EmployeeRestControllerHateOAS.class).getEmployee(employee.getEid())).withSelfRel();
        Link allEmployeesLink = linkTo(methodOn(EmployeeRestControllerHateOAS.class).getAllEmployees()).withRel("all-employees");
        Link  updateEmpLink = linkTo(methodOn(EmployeeRestControllerHateOAS.class).updateEmployee(employee)).withSelfRel();
        return EntityModel.of(employee, selfLink, allEmployeesLink,updateEmpLink);
    }
	
	

}
