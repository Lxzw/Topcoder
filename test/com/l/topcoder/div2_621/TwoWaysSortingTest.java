package com.l.topcoder.div2_621;

import static org.junit.Assert.*;

import org.junit.Test;

public class TwoWaysSortingTest {

	@Test
	public void testSortingMethod() {
		String[] stringlist = {"a","aa","bbb"};
		assertTrue("both".equals(TwoWaysSorting.sortingMethod(stringlist)));
	}
	
	@Test
	public void testSortingMethod1() {
		String[] stringlist = {"c", "bb", "aaa"};
		assertTrue("lengths".equals(TwoWaysSorting.sortingMethod(stringlist)));
	}
	
	@Test
	public void testSortingMethod2() {
		String[] stringlist = {"aaa", "z"};
		System.out.println(TwoWaysSorting.sortingMethod(stringlist));
		assertTrue("lexicographically".equals(TwoWaysSorting.sortingMethod(stringlist)));
	}
	
	@Test
	public void testSortingMethod3() {
		String[] stringlist = {"z"};
		System.out.println(TwoWaysSorting.sortingMethod(stringlist));
		assertTrue("both".equals(TwoWaysSorting.sortingMethod(stringlist)));
	}
	
	@Test
	public void testSortingMethod4() {
		String[] stringlist = {"abcdef", "bcdef", "cdef", "def", "ef", "f", "topcoder"};
		System.out.println(TwoWaysSorting.sortingMethod(stringlist));
		assertTrue("lexicographically".equals(TwoWaysSorting.sortingMethod(stringlist)));
	}
	
	


}
