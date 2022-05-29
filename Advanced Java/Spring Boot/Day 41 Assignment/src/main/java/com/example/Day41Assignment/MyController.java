package com.example.Day41Assignment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {
	@Autowired
	private UserRepository user_repo;
	
	@GetMapping("/")
	public String indexPage() {
		return "index";
	}
	
	@PostMapping("/save")
	public String saveUser(@ModelAttribute Users user, Model model) {
		user_repo.save(user);
		List<Users> list = user_repo.findAll();
		model.addAttribute("users", list);
		return "index";
	}
	
	@GetMapping("/showAll")
	public String showData(Model model) {
		List<Users> list = user_repo.findAll();
		model.addAttribute("users", list);
		return "result";
	}
}