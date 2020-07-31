package com.app.animals.service;

import org.springframework.stereotype.Service;

import com.app.animals.model.Animal;
import com.app.animals.model.AquaticAnimals;
import com.app.animals.model.Bird;
import com.app.animals.model.Butterfly;
import com.app.animals.model.Caterpillar;
import com.app.animals.model.Chicken;
import com.app.animals.model.ClownFish;
import com.app.animals.model.Dolphin;
import com.app.animals.model.Duck;
import com.app.animals.model.Fish;
import com.app.animals.model.FlyingAnimals;
import com.app.animals.model.Parrot;
import com.app.animals.model.Rooster;
import com.app.animals.model.Shark;
import com.app.animals.model.WalkingAnimals;
import com.app.animals.util.AnimalCount;

@Service
public class AnimalService {

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
	
	public Animal[] getAnimals() {
		return animals;
	}

	public void setAnimals(Animal[] animals) {
		this.animals = animals;
	}

	public AnimalCount count(Animal[] animals) {
		AnimalCount ac = new AnimalCount();
		int flyCnt=0 , walkCnt=0, singCnt=0, swimCnt=0;
		for (Animal a: animals) {
			if(a instanceof FlyingAnimals)
				flyCnt++;
			if (a instanceof WalkingAnimals)
				walkCnt++;
			if (a instanceof AquaticAnimals)
				swimCnt++;
			if (a instanceof Bird)
				singCnt++;
		}
		ac.setFlyCount(flyCnt);
		ac.setWalkCount(walkCnt);
		ac.setSwimCount(swimCnt);
		ac.setSingCount(singCnt);
		return ac;
	}

}
