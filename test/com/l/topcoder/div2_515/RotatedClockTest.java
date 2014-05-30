package com.l.topcoder.div2_515;

import static org.junit.Assert.*;

import org.junit.Test;

public class RotatedClockTest {

	@Test
	public void testGetEarliest() {
		int hour = 70;
		int min = 300;
		assertTrue("08:20".equals(RotatedClock.getEarliest(hour,min)));
	}
	
	@Test
	public void testGetEarliestA() {
		int hour = 90;
		int min = 120;
		assertTrue("11:00".equals(RotatedClock.getEarliest(hour,min)));
	}
	
	@Test
	public void testGetEarliestB() {
		int hour = 240;
		int min = 36;
		assertTrue("".equals(RotatedClock.getEarliest(hour,min)));
	}
	
	@Test
	public void testGetEarliestC() {
		int hour = 19;
		int min = 19;
		assertTrue("".equals(RotatedClock.getEarliest(hour,min)));
	}
	
	@Test
	public void testGetEarliestD() {
		int hour = 1;
		int min = 12;
		assertTrue("00:02".equals(RotatedClock.getEarliest(hour,min)));
	}

}
