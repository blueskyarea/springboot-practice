package com.itstudy365.springboot9cache.service;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {
    private final PropertyService propertyService;

    @Autowired
    public ExampleService(PropertyService propertyService) {
        this.propertyService = propertyService;
    }

    public void useCachedProperties() {
        String propertyFileName = "application.properties";
        Properties properties = propertyService.getProperties(propertyFileName);
        if (properties != null) {
            // Use the cached properties as needed
            System.out.println("Cached properties: " + properties);
        } else {
            System.out.println("Properties not cached.");
        }
    }
}
