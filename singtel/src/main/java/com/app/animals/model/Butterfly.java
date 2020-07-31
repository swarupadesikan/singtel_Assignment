package com.app.animals.model;

import com.app.animals.common.Constants;

public class Butterfly extends Animal implements FlyingAnimals, Egg{
	
	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return Constants.FLY;
	}
	
	public  String getState() {
		return Constants.PUPA;
	}

}
