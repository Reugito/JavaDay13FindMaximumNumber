package com.bridgelabz.programs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMaximumTest {
	TestMaximum testMax = new TestMaximum();
	
	@Test
	void testGetMaxNumberFirstPosition() {
		Integer maxInt = testMax.getMaxNumber(10, 2, 9);
		assertEquals(10, maxInt);
	}
	
	@Test
	void testGetMaxNumberSecondPosition() {
		Integer maxInt = testMax.getMaxNumber(10, 20, 9);
		assertEquals(20, maxInt);
	}
	
	@Test
	void testGetMaxNumberThirdPosition() {
		Integer maxInt = testMax.getMaxNumber(10, 2, 90);
		assertEquals(90, maxInt);
	}

}
