package com.app.animals.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.app.animals.common.Constants;

class DuckTest {

	@Test
	void test() {
		Duck duck = new Duck();
		assertEquals(Constants.FLY, duck.fly());
		assertEquals(Constants.SWIM, duck.swim());
		assertEquals(Constants.QUACK, duck.sing());
		assertEquals(Constants.WALK, duck.walk());
	}

}
