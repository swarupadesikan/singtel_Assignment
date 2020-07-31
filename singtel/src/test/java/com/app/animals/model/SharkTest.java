package com.app.animals.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.app.animals.common.Constants;

public class SharkTest {
	
	@Test
	void test() {
		Shark shark = new Shark();
		assertEquals(Constants.LARGE, shark.getSize());
		assertEquals(Constants.GREY, shark.getColor());
		assertEquals(Constants.EATFISH, shark.getCharacteristic());
	}

}
