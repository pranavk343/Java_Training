package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Day31Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Day31Application.class, args);
		StudentRepository stud = context.getBean(StudentRepository.class);
		// create row
		Student st = new Student(5,"Pranav");
		stud.save(st);
		System.out.println("Record Inserted");
		Student st1 = new Student();
		Student t1 = new Student(1,"DEMO");
		stud.delete(t1);
		stud.findAll();
	}
}
