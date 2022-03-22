package com.persistent.employeemanagementservice.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Address {

	@Id
	@Column(unique = true,nullable = false)
	private long addressId;
	
	//added
	@ManyToOne(cascade = CascadeType.ALL)
	private long employeeId;
	
	private AddressType addressType;
	
	private String addressLine1; 
	
	private String addressLine2;
	
	private String city;
	
	private String state;
	
	private String country;
}
