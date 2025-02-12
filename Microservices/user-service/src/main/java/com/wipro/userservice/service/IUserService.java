package com.wipro.userservice.service;

import com.wipro.userservice.dto.UserDTO;
import com.wipro.userservice.entity.User;
import com.wipro.userservice.vo.UserDepartmentVO;

public interface IUserService {
	
	
	
	public  User   addUser(UserDTO dto);
	
	public User  getUserById(long uid);
	
	
	public  UserDepartmentVO   getUserByIdWithDepartment(long uid);

}
