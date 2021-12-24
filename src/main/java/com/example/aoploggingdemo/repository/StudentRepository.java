package com.example.aoploggingdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.aoploggingdemo.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {

}
