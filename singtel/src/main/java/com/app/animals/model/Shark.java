package com.app.animals.model;

import com.app.animals.common.Constants;

public class Shark extends Fish{

	public String getCharacteristic() {
		return Constants.EATFISH;
	}
	
	public String getColor() {
		return Constants.GREY;
	}
	public  String getSize() {
		return Constants.LARGE;
	}
}
