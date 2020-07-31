package com.app.animals.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.core.env.Environment;
import org.springframework.test.util.ReflectionTestUtils;

import com.app.animals.common.Constants;

public class ParrotTest {
	
	@Test
	void test() {
		Parrot parrot = new Parrot();
		Environment env = mock(Environment.class);
		ReflectionTestUtils.setField(parrot, "env", env);
	Mockito.when(env.getProperty("app.animal.rooster")).thenReturn(Constants.COCKADOODLE);
		assertEquals(Constants.COCKADOODLE, parrot.sing(Constants.ROOSTER));
		assertEquals(Constants.WALK, parrot.walk());
		assertEquals(Constants.FLY, parrot.fly());
	}
}
