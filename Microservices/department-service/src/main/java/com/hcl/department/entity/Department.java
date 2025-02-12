package com.hcl.department.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
//@Table(name="department_table")
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  long departmentId;
	
	private  String departmentName;
	private  String  departmentAddress;
	private  String departmentCode;
	


	public Department() {

		
	}
	
	public long getDepartmentId() {
		return departmentId;
	}



	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}



	public String getDepartmentName() {
		return departmentName;
	}



	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}



	public String getDepartmentAddress() {
		return departmentAddress;
	}



	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}



	public String getDepartmentCode() {
		return departmentCode;
	}



	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}



	public Department(long departmentId, String departmentName, String departmentAddress, String departmentCode) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentAddress = departmentAddress;
		this.departmentCode = departmentCode;
	}
	
	
	

}
