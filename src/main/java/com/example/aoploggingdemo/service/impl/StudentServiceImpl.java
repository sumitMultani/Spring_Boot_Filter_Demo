package com.example.aoploggingdemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.aoploggingdemo.entity.StudentEntity;
import com.example.aoploggingdemo.repository.StudentRepository;
import com.example.aoploggingdemo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<StudentEntity> getStudents() {
		return studentRepository.findAll();
	}

	@Override
	public StudentEntity addStudent(StudentEntity student) {
		return studentRepository.save(student);
	}
	
	
	
}
