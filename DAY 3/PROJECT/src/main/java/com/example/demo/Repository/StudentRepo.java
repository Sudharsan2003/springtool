package com.example.demo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.database.Student;
public interface StudentRepo extends JpaRepository<Student,Integer>{

	
}