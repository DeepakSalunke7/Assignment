package com.persistent.employeemanagementservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.persistent.employeemanagementservice.entity.Department;
import com.persistent.employeemanagementservice.exception.ResourceNotFound;
import com.persistent.employeemanagementservice.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public List<Department> getDepartments() {
		return departmentRepository.findAll();
	}

	@Override
	public Department addDepartment(Department department) {
		return departmentRepository.save(department);	
	}

	@Override
	public Department updateDepartment(Department department) {
		return departmentRepository.save(department);
	}

	@Override
	public Department getDepartmentById(long deptId) {	
//		Optional<Department> department= departmentRepository.findById(id);
//		if(department.isPresent()){
//			return department.get();
//		}else {
//			throw new ResourceNotFound("id not present");
//		}
		return departmentRepository.findById(deptId).orElseThrow(()-> new ResourceNotFound("deptId not exist with given id :"+deptId));
	}
	
}
