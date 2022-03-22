package com.persistent.employeemanagementservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.persistent.employeemanagementservice.entity.Employee;
import com.persistent.employeemanagementservice.exception.ResourceNotFound;
import com.persistent.employeemanagementservice.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}
	
	@Override
	public Employee addEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeeById(long employeeId) {
		return employeeRepository.findById(employeeId).
				orElseThrow(()-> new ResourceNotFound("employeeId not exist with given id :"+ employeeId));
	}
}
