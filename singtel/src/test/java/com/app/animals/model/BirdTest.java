package com.app.animals.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.app.animals.common.Constants;

class BirdTest {

	@Test
	void testBird() {
		Bird bird = new Bird();
		assertEquals(Constants.SING, bird.sing());
		assertEquals(Constants.FLY, bird.fly());
		assertEquals(Constants.WALK, bird.walk());
	}

}
