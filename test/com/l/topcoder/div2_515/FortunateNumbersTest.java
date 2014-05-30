package com.l.topcoder.div2_515;

import static org.junit.Assert.*;

import org.junit.Test;

import com.l.topcoder.div2_515.FortunateNumbers;

public class FortunateNumbersTest {

	@Test
	public void testGetFortunate() {
		int[] a = {30000, 26264};
		int[] b = {30000, 29294};
		int[] c = {30000, 29594};
		assertTrue(3 == FortunateNumbers.getFortunate(a, b, c));
	}
	
	@Test
	public void testGetFortunateA() {
		int[] a = {1, 10, 100};
		int[] b = {3, 53};
		int[] c = {4, 54};
		assertTrue(2 == FortunateNumbers.getFortunate(a, b, c));
	}
	
	@Test
	public void testGetFortunateB() {
		int[] a = {47};
		int[] b = {500};
		int[] c = {33};
		assertTrue(0 == FortunateNumbers.getFortunate(a, b, c));
	}
	
	@Test
	public void testGetFortunateC() {
		int[] a = {100, 1, 10, 100, 1, 1};
		int[] b = {3, 53, 53, 53, 53, 53, 53};
		int[] c = {4, 54, 4, 54, 4, 54};
		assertTrue(2 == FortunateNumbers.getFortunate(a, b, c));
	}
	
	@Test
	public void testGetFortunateD() {
		int[] a = {500, 800};
		int[] b = {50, 80};
		int[] c = {5, 8};
		assertTrue(8 == FortunateNumbers.getFortunate(a, b, c));
	}

}
