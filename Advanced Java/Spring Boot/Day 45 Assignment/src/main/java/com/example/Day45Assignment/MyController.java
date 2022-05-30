package com.example.Day45Assignment;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	@GetMapping("/cart1")
	public String firstCart(@RequestParam String uname, Model model) {
		model.addAttribute("uname", uname);
		return "cart1";
	}
	
	@GetMapping("/cart2")
	public String secondCart(@RequestParam String uname, @RequestParam Map<String, Integer> list, Model model) {
		//Map<String, Integer> list= demo.getList();
		model.addAttribute("list", list);		
		model.addAttribute("uname", uname);
		return "cart2";
	}
	@GetMapping("/checkout")
	public String checkoutPage(@RequestParam String uname, @RequestParam Map<String, Integer> list, Model model) {
		return "checkout";
	}
}
