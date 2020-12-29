package org.st.service;

import java.util.List;
import java.util.Optional;

import org.st.model.Employee;

public interface IEmployeeService {

	public Integer saveEmployee(Employee e);
	
	public List<Employee> getAllEmployees();
	
	public void removeEmployee(Integer id);
	
	public Optional<Employee> getOneEmpoyee(Integer id);
	
	
	
	
	
	
}
