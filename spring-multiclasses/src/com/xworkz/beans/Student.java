package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Autowired
	private String studentName;
	@Autowired
	private int studentAge;

	public String getStudentName() {
		return studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}
}
