package com.persistent.employeemanagementservice.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Employee {

	@Id																														
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique = true,nullable = false)	
	private long employeeId;
	
	//added
	@OneToOne(cascade = CascadeType.ALL)
	private long deptId;
	
	private String name;
	
	private String designation;
	
	private double salary;
	
	private Date createdAt;
	
	private Date updatedAt;
	
	//added
	@OneToMany(cascade = CascadeType.ALL)
	private List<Address> address;
	
}
