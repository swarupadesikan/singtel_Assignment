package com.app.animals.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.app.animals.common.Constants;

class DolphinTest {

	@Test
	void test() {
		Dolphin dp = new Dolphin();
		assertEquals(Constants.SWIM, dp.swim());
	}

}
