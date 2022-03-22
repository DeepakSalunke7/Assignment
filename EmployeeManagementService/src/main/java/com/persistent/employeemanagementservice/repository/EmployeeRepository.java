package com.persistent.employeemanagementservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.persistent.employeemanagementservice.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
