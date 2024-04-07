package com.itstudy365.springboot12swagger.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.itstudy365.springboot12swagger.request.PaymentRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/payments")
public class PaymentController {
    @PostMapping("/processPayment")
    @ResponseStatus(HttpStatus.CREATED)
    public String processPayment(@RequestBody PaymentRequest paymentRequest) {
        System.out.println(paymentRequest.getAmount());
        System.out.println(paymentRequest.getMethod());
        return "Payment processed successfully";
    }
    
}
