package com.example.Day35_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Day352Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Day352Application.class, args);
		StudentDetails std = context.getBean(StudentDetails.class);
		std.setData();
		std.showData();
	}

}
