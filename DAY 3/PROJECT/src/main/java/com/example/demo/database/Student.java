package com.example.demo.database;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student_Details")
public class Student{
	@Id
	@Column(name="roll_no")
	private int roll_no;
	@Column(name="mark")
	private int mark;
	@Column(name="name")
	private String name;
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int roll_no,int mark,String name){
		super();
		this.roll_no=roll_no;
		this.mark=mark;
		this.name=name;
	}
	
	public Student()
	{
	}
}