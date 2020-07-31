package com.app.animals.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.app.animals.common.Constants;

class FishTest {

	@Test
	void test() {
		Fish fish = new Fish();
		assertEquals(Constants.SWIM, fish.swim());
	}

}
