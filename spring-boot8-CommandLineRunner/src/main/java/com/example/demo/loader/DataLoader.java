package com.example.demo.loader;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.model.Message;
import com.example.demo.repository.MessageRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor	// Creates constructor automatically for final field
@Component
public class DataLoader implements CommandLineRunner {
	private final MessageRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO: Please implement here
	}
}
