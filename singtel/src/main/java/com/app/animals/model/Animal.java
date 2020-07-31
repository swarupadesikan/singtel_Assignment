package com.app.animals.model;


public class Animal {
	
	String name = "Änimal";
	public Animal() {
		//this.
		this.name =this.getClass().getName();
					}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
