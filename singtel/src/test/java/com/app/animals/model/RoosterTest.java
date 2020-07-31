package com.app.animals.model;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.core.env.Environment;
import org.springframework.test.util.ReflectionTestUtils;

import com.app.animals.common.Constants;

class RoosterTest {

	@Test
	void test() {
		Rooster rooster = new Rooster();
		Environment env = mock(Environment.class);
		assertEquals(Constants.COCKADOODLE, rooster.sing());
		assertEquals(Constants.WALK, rooster.walk());
		ReflectionTestUtils.setField(rooster, "env", env);
		Mockito.when(env.getProperty("app.language.tamil")).thenReturn(Constants.TAMIL_COCK_SOUND);
		assertEquals(Constants.TAMIL_COCK_SOUND, rooster.sing(Constants.TAMIL));
	}

}
