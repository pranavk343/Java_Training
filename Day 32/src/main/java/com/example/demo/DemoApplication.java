package com.example.demo;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		StudentRepository stud = context.getBean(StudentRepository.class);
		
		
		//insert
		Student s1 = new Student(300,"pqr");
		stud.save(s1);
		
		//update
		Optional<Student> op = stud.findById(300);
		Student s2 = op.get();
		s2.setName("Demo");
	}
}
