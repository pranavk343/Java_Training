package com.example.Day44_2;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MembersController {
	
	@GetMapping("/")
	public String toIndex() {
		return "index";
	}
	
	@GetMapping("/main")
	public String optionSelect(@RequestParam String username, HttpSession model) {
		model.setAttribute("fname", username);
		return "main";
	}
	
	@GetMapping("/movie")
	public String goToMovie(HttpSession session, Model model) {
		model.addAttribute("fname", session.getAttribute("fname"));
	
		return "movie";
	}
	@GetMapping("/sport")
	public String goTosport(HttpSession session) {
		String n=(String)session.getAttribute("fname");
		System.out.println("Name of USer "+n);
		return "sport";
	}
}
