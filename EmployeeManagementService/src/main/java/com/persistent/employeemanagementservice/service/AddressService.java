package com.persistent.employeemanagementservice.service;

import com.persistent.employeemanagementservice.entity.Address;

public interface AddressService {

	public Address getAddressById(long addressId);
	
	public Address updateAddress(Address address);
	
	//public Address deleteAddressById(long addressId);
}
