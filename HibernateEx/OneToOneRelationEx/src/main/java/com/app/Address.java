package com.app;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "addrTab")
public class Address {

    @Id
    @Column(name = "aid")
	private Integer addrId;
    
    @Column(name = "loc")
    private String loc;
    
    @Column(name = "pcode")
    private Integer pinCode;

	public Address() {
		super();
	}

	public Address(Integer addrId, String loc, Integer pinCode) {
		super();
		this.addrId = addrId;
		this.loc = loc;
		this.pinCode = pinCode;
	}

	public Integer getAddrId() {
		return addrId;
	}

	public void setAddrId(Integer addrId) {
		this.addrId = addrId;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public Integer getPinCode() {
		return pinCode;
	}

	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address [addrId=" + addrId + ", loc=" + loc + ", pinCode=" + pinCode + "]";
	}
    
 }
