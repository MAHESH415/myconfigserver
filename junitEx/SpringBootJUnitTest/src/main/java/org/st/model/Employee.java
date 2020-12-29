package org.st.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.NonNull;

@Entity


public class Employee implements Comparable<Employee> {
    

	@Id
    @GeneratedValue
    private Integer empno;
	
   
	private String  empName;
	
    
	private Double empSal;

	public Employee(@NonNull String empName, @NonNull Double empSal) {
		super();
		this.empName = empName;
		this.empSal = empSal;
	}

	public Employee() {
		super();
	}

	public Integer getEmpno() {
		return empno;
	}

	public void setEmpno(Integer empno) {
		this.empno = empno;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}

	@Override
	public int compareTo(Employee arg0) {
		
		return 0;
	}
	
}
