package com.itstudy365.springboot10properties.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itstudy365.springboot10properties.config.SalesConfigProperties;

@Service
public class SalesService {
    private final SalesConfigProperties salesConfig;

    // Using constructor injection
    @Autowired
    public SalesService(SalesConfigProperties salesConfig) {
        this.salesConfig = salesConfig;
    }

    public void printSalesConfig() {
        System.out.println("Sales Region: " + salesConfig.getSalesRegion());
        System.out.println("Sales Threshold: " + salesConfig.getSalesThreshold());
    }
}
