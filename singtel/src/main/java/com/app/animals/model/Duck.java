package com.app.animals.model;

import com.app.animals.common.Constants;

public class Duck extends Bird implements AquaticAnimals, FlyingAnimals{

	public String swim() {
		return Constants.SWIM;
		}
	
	public String sing() {
		return Constants.QUACK;
		}
	
	public String fly() {
		return Constants.FLY;
		}
}
