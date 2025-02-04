package com.apis;


@SuppressWarnings(value = "class level")
public class Employee {
	
	@SuppressWarnings(value = { "instance level" })
	int eid;
	String ename;
	double salary;
	

	
	
	@Deprecated
	public Employee() {
		
		
	}
	
	
	public Employee(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
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
