package com.example.Day33;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Day33Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Day33Application.class, args);
		RoleRepository role = context.getBean(RoleRepository.class);
		EmpRepository emp = context.getBean(EmpRepository.class);
		Role r1 = new Role(2,"HR");
		role.save(r1);
		Role r2 = new Role(3,"Manager");
		role.save(r2);
		Emp e1 = new Emp(002,"XYZ",r2);
		emp.save(e1);
		Emp e2 = new Emp(003,"ABC",r1);
		emp.save(e2);
	}

}
