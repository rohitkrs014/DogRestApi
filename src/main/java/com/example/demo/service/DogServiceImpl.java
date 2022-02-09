package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Dog;
import com.example.demo.repository.DogRepository;


@Service
public class DogServiceImpl implements DogService{
	
	@Autowired
	DogRepository dogRepository;
	
	@Override
	public List<Dog> retrieveDogs() {
		return (List<Dog>) dogRepository.findAll();
	}

	@Override
	public List<String> retrieveDogBreed() {
		return (List<String>) dogRepository.findAllBreed();
	}

	@Override
	public String retrieveDogBreedById(Long id) {
		return (String) dogRepository.findBreedById(id);
	}

	@Override
	public List<String> retrieveDogNames() {
		return (List<String>) dogRepository.findAllNames();
	}
	
}
