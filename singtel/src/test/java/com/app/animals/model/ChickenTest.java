package com.app.animals.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.app.animals.common.Constants;

class ChickenTest {

	@Test
	void test() {
		Chicken chick = new Chicken();
		assertEquals(Constants.CLUCK, chick.sing());
		assertEquals(Constants.WALK, chick.walk());
	}

}
