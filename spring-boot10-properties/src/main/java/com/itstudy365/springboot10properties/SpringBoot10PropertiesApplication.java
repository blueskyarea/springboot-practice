package com.itstudy365.springboot10properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.itstudy365.springboot10properties.config.SalesConfigProperties;

@SpringBootApplication
@EnableConfigurationProperties(SalesConfigProperties.class)
public class SpringBoot10PropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot10PropertiesApplication.class, args);
	}

}
