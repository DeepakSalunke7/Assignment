package com.persistent.employeemanagementservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.persistent.employeemanagementservice.entity.Address;
import com.persistent.employeemanagementservice.service.AddressService;

@RestController
@RequestMapping("/api")
public class AddressController {

	@Autowired
	private AddressService addressService;

	// get address by addressId
	@GetMapping("/address/{addressId}")
	public ResponseEntity<Address> getAddressById(@PathVariable long addressId){
		return new ResponseEntity<Address>(addressService.getAddressById(addressId), HttpStatus.OK);
	}

	//update address by addressId
	@PutMapping("/address/{addressId}")
	public Address updateEmployee(@PathVariable long addressId, @RequestBody Address address) {
		return addressService.updateAddress(address);
	}
	
//	//delete address by addressId
//	@DeleteMapping("/address/{addressId}")
//	public ResponseEntity<Address> deleteAddressById(@PathVariable long addressId){
//		return new ResponseEntity<Address>(addressService.deleteAddressById(addressId), HttpStatus.OK);
//	}
}
