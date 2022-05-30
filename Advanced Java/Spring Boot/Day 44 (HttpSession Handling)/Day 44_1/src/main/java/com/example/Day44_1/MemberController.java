package com.example.Day44_1;

import org.springframework.stereotype.Controller;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;

@Controller
public class MemberController {
	
	@GetMapping("/")
	public String toIndex() {
		return "index";
	}
	@GetMapping("/mainpage")
	public String optionSelect(@RequestParam(name = "abc" , required = true)String fname) {
		return "main";
	}
}
