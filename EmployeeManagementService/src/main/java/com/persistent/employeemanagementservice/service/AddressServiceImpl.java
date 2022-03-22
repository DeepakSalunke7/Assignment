package com.persistent.employeemanagementservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.persistent.employeemanagementservice.entity.Address;
import com.persistent.employeemanagementservice.exception.ResourceNotFound;
import com.persistent.employeemanagementservice.repository.AddressRepository;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressRepository addressRepository;	
	
	// get address by addressId
	@Override
	public Address getAddressById(long addressId) {	
		return addressRepository.findById(addressId)
				.orElseThrow(()-> new ResourceNotFound("employeeId not exist with given id :"+ addressId));
	}

	@Override
	public Address updateAddress(Address address) {
		return addressRepository.save(address);
	}

//	@Override
//	public Address deleteAddressById(long addressId) {
//	 return addressRepository.deleteById(addressId)
//				.orElseThrow(()-> new ResourceNotFound("employeeId not exist with given id :" + addressId));
//	}
	
	

}