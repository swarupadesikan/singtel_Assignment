package com.app.animals.model;

import com.app.animals.common.Constants;

public class Rooster extends Bird{
	//a rooster is a chicken, since it is expected to not use inheritance for chicken,inherited from Bird

	public String sing() {
		return Constants.COCKADOODLE;
		}
}
