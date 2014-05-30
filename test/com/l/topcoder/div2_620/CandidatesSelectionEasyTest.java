package com.l.topcoder.div2_620;

import static org.junit.Assert.*;

import org.junit.Test;

public class CandidatesSelectionEasyTest {

	@Test
	public void testSort() {
		String[] score = {"ACB", "BAC", "CBA"};
		int x = 1;
		int[] obj = {1, 2, 0};
		assertTrue(CandidatesSelectionEasy.sort(score, x).length == obj.length );
	}

}
