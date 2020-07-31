package com.app.animals.model;

import com.app.animals.common.Constants;

public interface AquaticAnimals {
	public default String swim() {
		return Constants.SWIM;
	}
}
