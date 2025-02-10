package com.wipro.orm.crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="Employee_Info")


@NamedQueries( { @NamedQuery(name = "getAllEmployeeDetails" , query = "select e from Employee e  order by e.salary") ,
	
					@NamedQuery(name = "getSalaries" , query = "select e.salary from Employee e ")
				} )
public class Employee {
	
	@Id
	private int eid;
	
	@Column(name="emp_name")
	private String ename;
	
	private double salary;

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


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
	
	
	
	
	
	

}
