package com.wipro.springcore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.springcore.bean.Employee;
import com.wipro.springcore.repository.IEmployeeRepo;

@Service
public class EmployeeServiceImp implements IEmployeeService {

	@Autowired
	IEmployeeRepo  repo;
	
	@Autowired
	Employee emp;
	
	@Override
	public void getServiceInfo() {

			System.out.println("service info getting repo obj "+repo);
			
			
			
			System.out.println("emp obj in service "+emp);
			
			repo.getRepoInfo();
			

	}

}
