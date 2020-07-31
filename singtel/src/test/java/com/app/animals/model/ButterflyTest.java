package com.app.animals.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.app.animals.common.Constants;

public class ButterflyTest {
	@Test
	void test() {
		Butterfly btrfl = new Butterfly();
		assertEquals(Constants.FLY, btrfl.fly());
		assertEquals(Constants.PUPA, btrfl.getState());
	}
}
