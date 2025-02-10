package com.wipro.orm.crud.presentation;

import java.util.List;

import com.wipro.orm.crud.dao.EmployeeDAO;
import com.wipro.orm.crud.entity.Employee;

public class SelectQueriesDemo {

	public static void main(String[] args) {

		EmployeeDAO  dao  = new EmployeeDAO();
		
		System.out.println("HQL Query");
			// HQL Queries
			List<Employee>  list1 = dao.getAllEmployees();
			
				list1.forEach((emp)->{ System.out.println(emp);});
				
				
				
			System.out.println("Native SQL Query");	
		
			Employee emp =		dao.getEmployeeSQL();
			System.out.println(emp);
			
			System.out.println("Named Query Demo");
			
				List<Employee>	 list2 =		dao.getAllEmployeeDetails();
				
				list2.forEach((emp1)->{ System.out.println(emp1);});
				
				
							dao.getSalaries().forEach((salary)->{System.out.println(salary);});
							
			// HQL  DML Query call for delete
							
							dao.deleteByEname("tom");

	}

}
