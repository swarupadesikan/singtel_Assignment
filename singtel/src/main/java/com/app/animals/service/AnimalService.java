package com.app.animals.service;

import org.springframework.stereotype.Service;

import com.app.animals.model.Animal;
import com.app.animals.model.AquaticAnimals;
import com.app.animals.model.Bird;
import com.app.animals.model.FlyingAnimals;
import com.app.animals.model.WalkingAnimals;
import com.app.animals.util.AnimalCount;

@Service
public class AnimalService {

	//Animal[] animals = null;;
	
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
