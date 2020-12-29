package org.st.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.st.model.Employee;
import org.st.service.IEmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	
	@Autowired
	private IEmployeeService service;
	
	
	@PostMapping("/save")
	public ResponseEntity<String> saveEmployee(@RequestBody Employee employee){
		
		ResponseEntity<String> resp=null;
		try {
			
	          Integer id=service.saveEmployee(employee);	 
			
			  resp=new ResponseEntity<>("saved with"+id,HttpStatus.OK);
			  
	        }catch(Exception e){
			
			resp=new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
		
		return resp;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	@GetMapping("/all")
	public ResponseEntity<?> getAllEmployees() {
		
		
		ResponseEntity<?> resp=null;
		
	try {
		
		List<Employee> list=service.getAllEmployees();	
		
		if(list==null||list.isEmpty()) {
			
	resp=new ResponseEntity<String> ("no data found",HttpStatus.OK);
		
		}else {
			
			resp=new ResponseEntity<List<Employee>>(list,HttpStatus.OK);
		}
		
	}catch(Exception e) {
		
	e.printStackTrace();
		
	resp=new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);	
	}
	return resp;
	}
	
	
	
	
	
	
	
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<String> removeEmpoyee(@RequestParam Integer id) {
		
	ResponseEntity<String> resp=null;

	try {
		service.removeEmployee(id);
		resp=new ResponseEntity<String>("removedSucessfulll"+id,HttpStatus.OK);
		
		
	}catch(Exception e) {
		
		resp=new ResponseEntity<String>(id+"not found",HttpStatus.BAD_REQUEST);
		
	}
	
return resp;	
	}
	
	
	@GetMapping("/one/{id}")
	public ResponseEntity<?> getOneEmployee(@RequestParam Integer id){
		
	ResponseEntity<?> resp=null;
	
	try {
		
		Optional<Employee> ob=service.getOneEmpoyee(id);
		
		if(ob.isPresent()) {
		
		resp=new ResponseEntity<Employee>(ob.get(),HttpStatus.OK);
			
		}else{
			
		resp=new ResponseEntity<String> (id+"data not found",HttpStatus.BAD_REQUEST);
		}
	
	}catch(Exception e) {
		
		e.printStackTrace();
		
	}
		
return resp;
	}
	
}
