package com.l.topcoder.div2_515;

import static org.junit.Assert.*;

import org.junit.Test;

public class NewItemShopTwoTest {

	@Test
	public void testGetMaximum() {
		String[] customers = {"8,1,80 16,100,11", "12,10,100"};
		assertTrue(19.0 == NewItemShopTwo.getMaximum(customers));
	}

	public void testGetMaximumA() {
		String[] customers = {"8,1,80 16,100,11","12,10,90 13,30,5"};
		assertTrue(19.4 == NewItemShopTwo.getMaximum(customers));
	}
	
	public void testGetMaximumB() {
		String[] customers = {"0,90,25 2,90,25 4,90,25 6,90,25", "7,100,95"};
		assertTrue(95.0 == NewItemShopTwo.getMaximum(customers));
	}
	
	public void testGetMaximumC() {
		String[] customers = {"0,90,25 2,90,25 4,90,25 6,90,25", "7,100,80"};
		assertTrue(90.0 == NewItemShopTwo.getMaximum(customers));
	}
	
	public void testGetMaximumD() {
		String[] customers = {"0,3,1 2,4,1 4,5,9 6,2,6 8,5,3 10,5,8 12,9,7 14,9,3", 
		  "1,2,3 3,8,4 5,6,2 7,6,4 9,3,3 11,8,3 13,2,7 15,9,5"};
		assertTrue(3.0692999999999997 == NewItemShopTwo.getMaximum(customers));
	}
	
	
}
