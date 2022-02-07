package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.example.demo.model.Order;

@Controller
public class MyController {
	@GetMapping("/form")
	private String readOrder(@ModelAttribute Order order) {
		return "form";
	}
	
	@PostMapping("/form")
	private String response(@ModelAttribute Order order) {
		return "response";
	}
}
