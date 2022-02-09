package com.example.demo.service;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Dog not found")
public class DogNotFoundException {
	
	public DogNotFoundException() {
    }

	public DogNotFoundException(String message) {
        super();
    }
}
