package com.app.animals.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.app.animals.common.Constants;


@Component
public class Parrot extends Bird implements FlyingAnimals{
	@Autowired
	private Environment env;

	public String sing(String animal) {
		StringBuffer sb = new StringBuffer("app.animal.");
		sb.append(animal);
		return env.getProperty(sb.toString());
	}

	@Override
	public String fly() {
		return Constants.FLY;
	}

}
