package com.app.animals.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.animals.model.Animal;
import com.app.animals.service.AnimalService;

@RestController
public class AnimalController {
	
	@Autowired
	AnimalService animServ;
	
	@GetMapping("/animals")
	public Animal[] getAnimals() {
		return animServ.getAnimals();
	}

}
