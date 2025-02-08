package com.wipro.springcore.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepoImp implements IEmployeeRepo {

	
	@Autowired
	String  str;
	
	@Override
	public void getRepoInfo() {


		System.out.println("employee Repo info method is called");
		
		System.out.println("String obj from @Bean  "+str);

	}

}
