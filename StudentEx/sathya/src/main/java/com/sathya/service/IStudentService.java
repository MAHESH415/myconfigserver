package com.sathya.service;

import com.sathya.entities.Student;

public interface IStudentService {

	
	public Student insertStudents(Student student);
	
	
	public Iterable<Student> getAllStudents() ;
	
	
	public Student updateStudent(Student student);
	
	
	public void deleteById(Integer id);
	
	
}
