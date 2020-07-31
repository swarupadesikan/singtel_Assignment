package com.app.animals;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.animals.model.Bird;

@SpringBootApplication
public class SolutionApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SolutionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
	}

}
