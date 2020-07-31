package com.app.animals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.animals.common.Constants;
import com.app.animals.model.Animal;
import com.app.animals.util.AnimalCount;
import com.app.animals.model.Bird;
import com.app.animals.model.Butterfly;
import com.app.animals.model.Caterpillar;
import com.app.animals.model.Chicken;
import com.app.animals.model.ClownFish;
import com.app.animals.model.Dolphin;
import com.app.animals.model.Duck;
import com.app.animals.model.Fish;
import com.app.animals.model.Parrot;
import com.app.animals.model.Rooster;
import com.app.animals.model.Shark;
import com.app.animals.service.AnimalService;

@SpringBootApplication
public class SolutionApplication implements CommandLineRunner {
	@Autowired
	Parrot parrot;
	@Autowired
	AnimalService as;
	
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
		Fish fish = new Fish();
		fish.swim();
		Shark shark = new Shark();
		shark.getColor();
		shark.getSize();
		shark.getCharacteristic();
		ClownFish cf = new ClownFish();
		cf.getColor();
		cf.getSize();
		cf.getCharacteristic();
		Dolphin dp = new Dolphin();
		dp.swim();
		Butterfly butrFly = new Butterfly();
		butrFly.fly();
		butrFly.getState();
		Caterpillar catpr = new Caterpillar();
		catpr.walk();
		catpr.getState();
		//
		Animal[] animals = new Animal[]{
				new Bird(),
				new Duck(),
				new Chicken(),
				new Rooster(),
				new Parrot(),
				new Fish(),
				new Shark(),
				new ClownFish(),
				new Dolphin(),
				new Butterfly(),
				new Caterpillar()};
		AnimalCount ac = as.count(animals);
		System.out.println("fly cnt "+ac.getFlyCount());
		System.out.println("walk cnt"+ac.getWalkCount());
		System.out.println("sing cnt"+ac.getSingCount());
		System.out.println("swim cnt"+ac.getSwimCount());
		}

}
