package com.wipro.userservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class UserDTO {
	
	private long userId;
	private String username;
	private String email;
	private long departmentId;
	
	
	
	
	
	
	
	
	
	
	
	public UserDTO() {
		super();
	}
	public UserDTO(long userId, String username, String email, long departmentId) {
		super();
		this.userId = userId;
		this.username = username;
		this.email = email;
		this.departmentId = departmentId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}
	
	
	

}
