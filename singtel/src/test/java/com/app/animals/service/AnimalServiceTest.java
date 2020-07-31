package com.app.animals.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.app.animals.model.Animal;
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
import com.app.animals.util.AnimalCount;

class AnimalServiceTest {

	@Test
	void testCount() {
		AnimalService as = new AnimalService();
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
		assertNotEquals(0, ac.getFlyCount());
		assertNotEquals(0, ac.getWalkCount());
		assertNotEquals(0, ac.getSwimCount());
		assertNotEquals(0, ac.getSingCount());
		assertEquals(3, ac.getFlyCount());
		assertEquals(6, ac.getWalkCount());
		assertEquals(5, ac.getSwimCount());
		assertEquals(5, ac.getSingCount());
	}

}
