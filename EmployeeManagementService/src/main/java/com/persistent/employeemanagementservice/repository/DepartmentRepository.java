package com.persistent.employeemanagementservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.persistent.employeemanagementservice.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{
	
}
