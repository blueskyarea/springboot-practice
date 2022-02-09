package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
    @GetMapping("/")
    public String index() {
        return "hello";
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(required = false) String message, Model model) {
        model.addAttribute("test", message);
        return "hello";
    }
    
}
