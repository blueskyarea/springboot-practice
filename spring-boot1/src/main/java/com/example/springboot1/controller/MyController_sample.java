package com.example.springboot1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController_sample {
  @RequestMapping("/")
  public String index() {
    return "hello";
  }
}
