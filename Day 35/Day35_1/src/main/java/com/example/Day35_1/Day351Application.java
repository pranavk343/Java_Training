package com.example.Day35_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Day351Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Day351Application.class, args);
		MyController controller = context.getBean(MyController.class);
		controller.sayHello();
		controller.getMsg();
	}

}
