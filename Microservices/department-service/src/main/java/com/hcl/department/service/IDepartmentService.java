package com.hcl.department.service;

import com.hcl.department.dto.DepartmentDTO;
import com.hcl.department.entity.Department;

public interface IDepartmentService {
	
	
	public Department  addDepartment(DepartmentDTO departmentDTO);
	
	public Department   getDeptById(long id);
	

}
