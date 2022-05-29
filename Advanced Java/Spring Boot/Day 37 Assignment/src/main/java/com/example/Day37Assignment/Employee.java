package com.example.Day37Assignment;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int emp_Id;
	private String emp_Name;
	private String emp_Address;
	private String emp_Email;
	private double emp_Number;
	private int emp_Salary;
	
	public Employee() {
		
	}

	public Employee(int emp_Id, String emp_Name, String emp_Address, String emp_Email, double emp_Number,
			int emp_Salary) {
		super();
		this.emp_Id = emp_Id;
		this.emp_Name = emp_Name;
		this.emp_Address = emp_Address;
		this.emp_Email = emp_Email;
		this.emp_Number = emp_Number;
		this.emp_Salary = emp_Salary;
	}

	public int getEmp_Id() {
		return emp_Id;
	}

	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
	}

	public String getEmp_Name() {
		return emp_Name;
	}

	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}

	public String getEmp_Address() {
		return emp_Address;
	}

	public void setEmp_Address(String emp_Address) {
		this.emp_Address = emp_Address;
	}

	public String getEmp_Email() {
		return emp_Email;
	}

	public void setEmp_Email(String emp_Email) {
		this.emp_Email = emp_Email;
	}

	public double getEmp_Number() {
		return emp_Number;
	}

	public void setEmp_Number(double emp_Number) {
		this.emp_Number = emp_Number;
	}

	public int getEmp_Salary() {
		return emp_Salary;
	}

	public void setEmp_Salary(int emp_Salary) {
		this.emp_Salary = emp_Salary;
	}
	
	
}
