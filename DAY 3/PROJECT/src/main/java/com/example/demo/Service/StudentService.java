package com.example.demo.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.StudentRepo;
import com.example.demo.database.*;

@Service
public class StudentService {
    @Autowired
    private StudentRepo em;

    public Student savedata(Student e){
        return em.save(e);
    }

    public List<Student> findall(){
        return em.findAll();
    }

    
}