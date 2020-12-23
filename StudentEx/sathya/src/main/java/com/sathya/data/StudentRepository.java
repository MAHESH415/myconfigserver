package com.sathya.data;

import org.springframework.data.repository.CrudRepository;

import com.sathya.entities.Student;

public interface StudentRepository  extends CrudRepository< Student, Integer> {

}
