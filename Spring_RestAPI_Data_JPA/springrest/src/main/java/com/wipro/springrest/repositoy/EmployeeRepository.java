package com.wipro.springrest.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.springrest.entity.Employee;

@Repository //optional
public interface EmployeeRepository  extends JpaRepository<Employee, Integer>{

}
