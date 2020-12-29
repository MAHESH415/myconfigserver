package org.st.service.impl;


import java.util.Collections;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.st.model.Employee;
import org.st.model.EmployeeRepository;
import org.st.service.IEmployeeService;

@Service
public class EmployeeServiceIMPL implements IEmployeeService {

	
	@Autowired
	private EmployeeRepository repo; 
	
	@Override
	public Integer saveEmployee(Employee e) {
		
		e.setEmpName("mahesh");
		
		e.setEmpSal(3.5);
		
	     return repo.save(e).getEmpno();
	
	}

	@Override
	public List<Employee> getAllEmployees() {

    List<Employee> list=repo.findAll();
    
    Collections.sort(list);
    
    return list;
		
		}

	@Override
	public void removeEmployee(Integer id) {
             repo.deleteById(id);
	}

	@Override
	public Optional<Employee> getOneEmpoyee(Integer id) {
		
		Optional<Employee> emp=repo.findById(id);
		
		return emp;
	}
}
