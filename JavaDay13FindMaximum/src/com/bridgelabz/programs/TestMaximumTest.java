package com.bridgelabz.programs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMaximumTest {
	TestMaximum testMax = new TestMaximum();
	
	@Test
	void testGetMaxNumberFirstPosition() {
		Double maxDoubleNum = testMax.getMaxNumber(10.5, 2.5, 9.8);
		assertEquals(10.5, maxDoubleNum);
	}
	
	@Test
	void testGetMaxNumberSecondPosition() {
		Double maxDoubleNum = testMax.getMaxNumber(10.5, 20.5, 9.8);
		assertEquals(20.5, maxDoubleNum);
	}
	
	@Test
	void testGetMaxNumberThirdPosition() {
		Double maxDoubleNum = testMax.getMaxNumber(10.5, 2.5, 90.8);
		assertEquals(90.8, maxDoubleNum);
	}

}
