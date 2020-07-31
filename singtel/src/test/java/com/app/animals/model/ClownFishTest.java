package com.app.animals.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.app.animals.common.Constants;

public class ClownFishTest {
	
	@Test
	void test() {
		ClownFish cf = new ClownFish();
		assertEquals(Constants.SMALL, cf.getSize());
		assertEquals(Constants.ORANGE, cf.getColor());
		assertEquals(Constants.JOKES, cf.getCharacteristic());
	}

}
