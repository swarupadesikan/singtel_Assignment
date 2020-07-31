package com.app.animals.model;

import org.springframework.stereotype.Component;

import com.app.animals.common.Constants;

@Component
public class Bird extends Animal implements WalkingAnimals{
	
	public String sing() {
		return Constants.SING;
	}
}
