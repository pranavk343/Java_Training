package com.example.Day4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Day34Application {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Day34Application.class, args);
		CartRepository cart = context.getBean(CartRepository.class);
		ItemsRepository items = context.getBean(ItemsRepository.class);
		Cart c1 = new Cart(1,"Electronics");
		cart.save(c1);
		Items s1 = new Items(1,"Mouse",649,c1);
		items.save(s1);
	}
}