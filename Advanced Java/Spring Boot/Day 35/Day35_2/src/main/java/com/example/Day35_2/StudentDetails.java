package com.example.Day35_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StudentDetails {
	
	@Autowired
	private Student stud;
/*	@Autowired
	public StudentDetails(Student stud) {
		super();
		this.stud = stud;
	}
*/
	
	void setData() {
		stud.setId(100);
		stud.setName("Demo");
	}
/*	
	public Student getStud() {
		return stud;
	}

	@Autowired
	public void setStud(Student stud) {
		this.stud = stud;
	}
*/
	void showData() {
		System.out.println(stud.getId());
		System.out.println(stud.getName());
	}
}
