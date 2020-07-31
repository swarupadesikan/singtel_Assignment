package com.app.animals.model;

import com.app.animals.common.Constants;

public class Caterpillar extends Animal implements WalkingAnimals, Egg{
	public  String walk() {
		return Constants.CRAWL;
	};
	
	public  String getState() {
		return Constants.LARVA;
	}
}
