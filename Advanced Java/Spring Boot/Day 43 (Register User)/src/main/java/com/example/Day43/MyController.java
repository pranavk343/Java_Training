package com.example.Day43;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	@Autowired
	private EmployeeRepository emprepo;
	
	@GetMapping("/")
	public String toIndex() {
		return "index";
	}
	
	@GetMapping("/newUser")
	public String toNewAccount() {
		return "register";
	}
	@PostMapping("/user")
	public String WelcomePage(@RequestParam(name = "empName",required = true)String fname,@RequestParam(name="empPass",required = true)String fpass) {
	
		List<Employee> list= emprepo.findAll();
		boolean f = false;
		for(Employee u1 : list) {
			if(u1.getEmpName().equals(fname) && u1.getEmpPass().equals(fpass)) {
				f = true;
			}
		}
		if(f==false) {
			return "index";
		}else {
			return "welcome";
		}
	}
	@PostMapping("/createAcc")
	public String saveAcc(@ModelAttribute Employee emp) {
		emprepo.save(emp);		
		return "index";
	}
}
