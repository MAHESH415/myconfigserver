package com.app;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "emp")
public class Employee {

	@Id
	@Column(name = "eid")
	private Integer empId;
	
	@Column(name = "ename")
	private String empName;
	
	@Column(name = "esal")
	private double empsal;
	
	
	@ManyToOne
	@JoinColumn(name = "aidfk")
	private Address addr;


	public Employee() {
		super();
	}


	public Employee(Integer empId, String empName, double empsal, Address addr) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empsal = empsal;
		this.addr = addr;
	}


	public Integer getEmpId() {
		return empId;
	}


	public void setEmpId(Integer empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public double getEmpsal() {
		return empsal;
	}


	public void setEmpsal(double empsal) {
		this.empsal = empsal;
	}


	public Address getAddr() {
		return addr;
	}


	public void setAddr(Address addr) {
		this.addr = addr;
	}


	@Override
	public String toString() {
		return "Empolyee [empId=" + empId + ", empName=" + empName + ", empsal=" + empsal + ", addr=" + addr + "]";
	}
	
}
