package com.wipro.springrest.repositoy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wipro.springrest.entity.Employee;

@Repository // optional
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	public Employee findByEname(String ename);

	public List<Employee> findBySalaryGreaterThan(double salary);

	
		// JPQL or HQL
	
	@Query("select  e  from Employee e  where  e.salary >?1 and e.salary < ?2")
			//@Query("select  e  from Employee e  where  e.salary > :min and e.salary < :max")
			public  List<Employee>  getAllFilterBySalary(double min , double max);
			
			
			@Modifying // only for DML queries
			@Query("delete from Employee  e  where e.ename = ?1")  
			public  void  deleteByEname(String ename);
	
		
	
}
