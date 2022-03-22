package com.persistent.employeemanagementservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.persistent.employeemanagementservice.entity.Employee;
import com.persistent.employeemanagementservice.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	//get all employee
	@GetMapping("/employee")
	public List<Employee> listOfEmployee(){
		return employeeService.getEmployees();
	}

	//add employee
	@PostMapping("/employee")
	public Employee updateDepartment(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}

	//update employee
	@PutMapping("/employee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}

	//get employee by id
	@GetMapping("/employee/{employeeId}")
	public ResponseEntity<Employee> getDepartmentById(@PathVariable long employeeId){
		return new ResponseEntity<Employee>(employeeService.getEmployeeById(employeeId), HttpStatus.OK);
	}
}
