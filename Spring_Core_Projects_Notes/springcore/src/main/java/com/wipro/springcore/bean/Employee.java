package com.wipro.springcore.bean;

import org.springframework.stereotype.Component;

//@Controller("e1")
//@Repository("e1")
//@Service("e1")
@Component("e1")
public class Employee {
	
	
	private int eid;
	private String ename;
	private double salary;
	
	public Employee() {
		
		System.out.println("Employee() called...");
	}
	
	
	public Employee(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		
		System.out.println("parameter Employee() constructor called..");
	}


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		
		System.out.println("setter is called..");
		
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
