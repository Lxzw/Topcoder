package com.l.knowledge.dp;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void testMinimumTotal() {
		
		ArrayList<Integer> index1 = new ArrayList<Integer>();
		index1.add(2);
		ArrayList<Integer> index2 = new ArrayList<Integer>();
		index2.add(3);
		index2.add(4);
		ArrayList<ArrayList<Integer>> triangle = 
				new ArrayList<ArrayList<Integer>>();
		triangle.add(index1);
		triangle.add(index2);
		assertTrue(5 == Triangle.minimumTotal(triangle));
	}

}
