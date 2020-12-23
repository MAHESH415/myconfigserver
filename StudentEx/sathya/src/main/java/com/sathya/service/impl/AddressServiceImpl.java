package com.sathya.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.data.AddressRepository;
import com.sathya.entities.Address;
import com.sathya.service.IAddressService;

@Service
public class AddressServiceImpl  implements IAddressService{

	@Autowired
	private AddressRepository  addressRepository;

	@Override
	public Address insertaddress(Address address) {
		
		return addressRepository.save(address);
	}

	@Override
	public Iterable<Address> getAllAddress() {
	
		return addressRepository.findAll();
	}

	@Override
	public Address updateAddres(Address addres) {
		
		return addressRepository.save(addres);
	}

	@Override
	public void deleteById(Integer id) {

		addressRepository.deleteById(id);
	}

	
}
