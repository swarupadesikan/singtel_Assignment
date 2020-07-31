package com.app.animals.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.app.animals.common.Constants;

class RoosterTest {

	@Test
	void test() {
		Rooster rooster = new Rooster();
		assertEquals(Constants.COCKADOODLE, rooster.sing());
		assertEquals(Constants.WALK, rooster.walk());
	}

}
