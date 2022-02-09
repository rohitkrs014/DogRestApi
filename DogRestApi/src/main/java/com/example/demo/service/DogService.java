package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Dog;

public interface DogService {
	List<Dog> retrieveDogs();
    List<String> retrieveDogBreed();
    String retrieveDogBreedById(Long id);
    List<String> retrieveDogNames();
}
