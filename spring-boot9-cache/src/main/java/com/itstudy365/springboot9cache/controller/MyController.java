package com.itstudy365.springboot9cache.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itstudy365.springboot9cache.service.ExampleService;

@Controller
public class MyController {
  @Autowired
  ExampleService exampleService;

  @RequestMapping("/")
  public String index() {
    exampleService.useCachedProperties();
    return "hello";
  }
}
