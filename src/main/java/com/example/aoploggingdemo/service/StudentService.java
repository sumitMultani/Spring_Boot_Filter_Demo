package com.example.aoploggingdemo.service;

import java.util.List;

import com.example.aoploggingdemo.entity.StudentEntity;

public interface StudentService {

	List<StudentEntity> getStudents();

	StudentEntity addStudent(StudentEntity student);

}
