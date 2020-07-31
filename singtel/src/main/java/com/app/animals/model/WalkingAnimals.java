package com.app.animals.model;

import com.app.animals.common.Constants;

public interface WalkingAnimals {
	public  default String walk() {
		return Constants.WALK;
	};
}
