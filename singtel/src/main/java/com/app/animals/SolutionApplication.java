package com.app.animals;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.animals.model.Bird;
import com.app.animals.model.Chicken;
import com.app.animals.model.Duck;

@SpringBootApplication
public class SolutionApplication implements CommandLineRunner {

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
	}

}
