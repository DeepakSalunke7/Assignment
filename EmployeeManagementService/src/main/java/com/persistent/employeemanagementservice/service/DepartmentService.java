package com.persistent.employeemanagementservice.service;

import java.util.List;

import com.persistent.employeemanagementservice.entity.Department;

public interface DepartmentService {

	public List<Department> getDepartments();

	public Department addDepartment(Department department);
	
	public Department updateDepartment(Department department);

	public Department getDepartmentById(long deptId);
	
	
}
