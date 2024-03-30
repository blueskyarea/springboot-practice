package com.itstudy365.springboot10properties.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

import com.itstudy365.springboot10properties.service.SalesService;

@Controller
public class MyController {
  @Autowired
  SalesService salesService;

  @RequestMapping("/")
  public String index() {
    salesService.printSalesConfig();
    return "hello";
  }
}