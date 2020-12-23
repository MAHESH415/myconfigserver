package com.sathya.service;

import com.sathya.entities.Address;

public interface IAddressService {

	
	public Address insertaddress(Address addres);
	
	
	public Iterable<Address> getAllAddress() ;
	
	
	public Address updateAddres(Address addres);
	
	
	public void deleteById(Integer id);
	
	
}
