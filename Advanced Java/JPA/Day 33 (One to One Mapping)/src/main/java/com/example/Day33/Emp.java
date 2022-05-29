package com.example.Day33;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class Emp {
	@Id
	private int emp_id;
	private String name;
	
	@OneToOne
	@JoinColumn(name = "roll_id")
	private Role rollObj;

	public Emp() {
	}

	public Emp(int emp_id, String name, Role rollObj) {
		this.emp_id = emp_id;
		this.name = name;
		this.rollObj = rollObj;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Role getRollObj() {
		return rollObj;
	}

	public void setRollObj(Role rollObj) {
		this.rollObj = rollObj;
	}
	
}
