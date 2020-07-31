package com.app.animals.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.app.animals.common.Constants;
@Component
public class Rooster extends Bird{
	//a rooster is a chicken, since it is expected to not use inheritance for chicken,inherited from Bird
	@Autowired
	private Environment env;
	public String sing() {
		return Constants.COCKADOODLE;
		}
	
	public String sing(String language) {
		StringBuffer sb = new StringBuffer("app.language.");
		sb.append(language);
		return env.getProperty(sb.toString());
	}
}
