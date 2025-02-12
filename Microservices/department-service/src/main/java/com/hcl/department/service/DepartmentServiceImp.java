package com.hcl.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.department.dto.DepartmentDTO;
import com.hcl.department.entity.Department;
import com.hcl.department.repository.DepartmentRepository;

@Service
public class DepartmentServiceImp implements IDepartmentService {

		@Autowired
		DepartmentRepository repo;
	
	
	@Override
	public Department addDepartment(DepartmentDTO departmentDTO) {
		
		Department dept = new Department();
		
				dept.setDepartmentName(departmentDTO.getDepartmentName());
				dept.setDepartmentAddress(departmentDTO.getDepartmentAddress());
				dept.setDepartmentCode(departmentDTO.getDepartmentCode());
		
		return repo.save(dept);
	}

	@Override
	public Department getDeptById(long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(new Department());
	}

}
