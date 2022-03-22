package com.persistent.employeemanagementservice.service;

import java.util.List;

import com.persistent.employeemanagementservice.entity.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee employee);

	public List<Employee> getEmployees();
	
	public Employee updateEmployee(Employee employee);
	
	public Employee getEmployeeById(long employeeId);
}
