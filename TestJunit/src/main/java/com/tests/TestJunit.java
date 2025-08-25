package com.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit {
	@Test
	public void test1() {
		int a = 10;
		assertEquals(10, a);
	}
}
