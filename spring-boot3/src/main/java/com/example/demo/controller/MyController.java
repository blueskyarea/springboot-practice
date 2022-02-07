package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	@GetMapping("/")
	public String index() {
		return "myform";
	}
	
	@PostMapping("/myresponse")
	public String myresponse(@RequestParam String message, Model model) {
		model.addAttribute("message", message);
		return "myresponse";
	}
}
