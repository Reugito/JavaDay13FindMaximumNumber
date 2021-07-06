package com.bridgelabz.programs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMaximumTest {
	TestMaximum testMax = new TestMaximum();
	
	@Test
	void testGetMaxNumberFirstPosition() {
		String maxStr = testMax.getMaxStr("hello", "hi", "h");
		assertEquals("hello", maxStr);
	}
	
	@Test
	void testGetMaxNumberSecondPosition() {
		String maxStr = testMax.getMaxStr("hi", "hello", "h");
		assertEquals("hello", maxStr);
	}
	
	@Test
	void testGetMaxNumberThirdPosition() {
		String maxStr = testMax.getMaxStr("hi", "h", "hello");
	}

}
