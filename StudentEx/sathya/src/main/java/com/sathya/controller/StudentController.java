package com.sathya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.entities.Student;
import com.sathya.service.IStudentService;

@RestController
@RequestMapping(params = "/student")
public class StudentController {

	@Autowired
	private IStudentService studentSerivce;
	
	
	@PostMapping(path = "/insertData")
	public Student insertData(Student student) {
		
		return studentSerivce.insertStudents(student);
	}
	
	
	@GetMapping(path = "/getAllStudents")
	public Iterable<Student> getAllstudent() {
		
		return studentSerivce.getAllStudents();
	}
	
	
	
	@PutMapping(path = "/updateStuent")
	public Student updatestudent(Student student) {
		
		return studentSerivce.updateStudent(student);
	}
	
	
	
	@DeleteMapping(path = "/deleteById")
	public void deleteById(Integer id ) {
		
		studentSerivce.deleteById(id);
	}
	
	
	
	
	
}
