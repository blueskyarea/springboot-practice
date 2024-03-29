package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Message;
import com.example.demo.repository.MessageRepository;

@Controller
public class MessageController {
	private final MessageRepository repository;
	
	//@Autowired <- OK to omit if only 1 constructor
	public MessageController(MessageRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/")
	public String getAllMessages(@ModelAttribute Message message, Model model) {
		model.addAttribute("messages", repository.findAll());
		return "list";
	}
	
	@PostMapping("/add")
	public String addMessage(@Validated @ModelAttribute Message message, BindingResult result, Model model) {
		model.addAttribute("messages", repository.findAll());
		if (result.hasErrors()) {
			return "list";
		}
		repository.save(message);
		return "redirect:/";
	}
}
