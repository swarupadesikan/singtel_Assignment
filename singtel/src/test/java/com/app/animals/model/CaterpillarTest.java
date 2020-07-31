package com.app.animals.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.app.animals.common.Constants;

public class CaterpillarTest {
	@Test
	void test() {
		Caterpillar cat = new Caterpillar();
		assertEquals(Constants.CRAWL, cat.walk());
		assertEquals(Constants.LARVA, cat.getState());
	}
}
