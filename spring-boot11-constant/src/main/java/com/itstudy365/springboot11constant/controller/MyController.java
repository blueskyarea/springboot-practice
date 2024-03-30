package com.itstudy365.springboot11constant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.itstudy365.springboot11constant.constant.PaymentType;


@Controller
public class MyController {
    @GetMapping("/getPaymentType")
    public String getPaymentType(@RequestParam(required = false) Short paymentType) {
        PaymentType type = PaymentType.getType(paymentType);
        System.out.println("Selected Payment Type: " + type.getName());
        return "index";
    }
    
}
