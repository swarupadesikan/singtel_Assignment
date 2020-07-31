package com.app.animals.model;

import com.app.animals.common.Constants;

public class Chicken extends Bird implements WalkingAnimals {

	public String sing() {
		return Constants.CLUCK;
		}
}
