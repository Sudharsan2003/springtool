package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.StudentService;
import com.example.demo.database.Student;

@RestController
public class Controller {
	
	@Autowired
	StudentService ss;
	
	@PostMapping("/savedata")
	public String savingStudent(@RequestBody Student student) {
		ss.savedata(student);
		return "saved";  
	}
	@GetMapping("/findall")
	public List<Student> listing(){
		return ss.findall();
	}
}