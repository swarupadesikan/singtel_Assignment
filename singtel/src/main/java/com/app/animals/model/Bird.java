package com.app.animals.model;

import com.app.animals.common.Constants;

public class Bird extends Animal implements WalkingAnimals{
	
	public String sing() {
		return Constants.SING;
		}
}
