package com.example.Day37Assignment;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository em_repo;
	
	@PostMapping("/save")
	public Employee createEmployee(@RequestBody Employee emp) {
		return em_repo.save(emp);
	}
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployee(){
		return em_repo.findAll();
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable("id") Integer empId) {
		Optional<Employee> op = em_repo.findById(empId);
		Employee emp = op.get();
		return emp;
	}
	
	@PostMapping("/update/{id}")
	public Boolean updateEmployee(@PathVariable(value="id") Integer empId, @RequestBody Employee empDetails) throws Exception{
		boolean f = true;
		try {
			Optional<Employee> op = em_repo.findById(empId);
			Employee em = op.get();
			em.setEmp_Name(empDetails.getEmp_Name());
			em.setEmp_Address(empDetails.getEmp_Address());
			em.setEmp_Email(empDetails.getEmp_Email());
			em.setEmp_Number(empDetails.getEmp_Number());
			em.setEmp_Salary(empDetails.getEmp_Salary());
		} catch (Exception e) {
			f = false;
			// TODO: handle exception
		}
		return f;
	}
	
	@DeleteMapping("/delete/{id}")
	public Boolean deleteEmployee(@PathVariable(value="id") Integer empId, @RequestBody Employee empDetails) throws Exception{
		boolean f = true;
		try {
			Optional<Employee> op = em_repo.findById(empId);
			Employee em = op.get();
			em_repo.delete(em);
		} catch (Exception e) {
			f = false;
			// TODO: handle exception
		}
		return f;
	}
}
