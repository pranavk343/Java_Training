package com.example.Day33Assignment;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Role {
	@Id
	private int roll_id;
	private String description;
	
	@OneToOne(mappedBy = "rollObj")
	private Emp emp;
		
	public Emp getEmp() {
		return emp;
	}


	public void setEmp(Emp emp) {
		this.emp = emp;
	}


	public Role() {
	}
	
	
	public Role(int roll_id, String description) {
		this.roll_id = roll_id;
		this.description = description;
	}


	public int getRoll_id() {
		return roll_id;
	}


	public void setRoll_id(int roll_id) {
		this.roll_id = roll_id;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
