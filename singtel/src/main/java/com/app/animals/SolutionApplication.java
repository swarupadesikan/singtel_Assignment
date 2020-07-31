package com.app.animals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.animals.common.Constants;
import com.app.animals.model.Bird;
import com.app.animals.model.Chicken;
import com.app.animals.model.Duck;
import com.app.animals.model.Parrot;
import com.app.animals.model.Rooster;


@SpringBootApplication
public class SolutionApplication implements CommandLineRunner {
	@Autowired
	Parrot parrot;
	
	public static void main(String[] args) {
		SpringApplication.run(SolutionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Bird bird = new Bird();
		bird.walk();
		bird.sing();
		//bird.fly();//moving fly to more specific birds
		Duck duck = new Duck();
		duck.walk();
		duck.sing();
		duck.swim();
		Chicken chick = new Chicken();
		chick.walk();
		chick.sing();
		Rooster roost = new Rooster();
		roost.walk();
		roost.sing();
		parrot.walk();
		parrot.sing(Constants.DOG);
		parrot.fly();
	
	}

}
