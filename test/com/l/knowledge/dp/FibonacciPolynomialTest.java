package com.l.knowledge.dp;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciPolynomialTest {

	@Test
	public void test() {
		assertTrue(1 == FibonacciPolynomial.fib(0));
		assertTrue(1 == FibonacciPolynomial.fib(1));
		assertTrue(8 == FibonacciPolynomial.fib(5));
	}
	
	@Test
	public void testFibDp() {
		assertTrue(1 == FibonacciPolynomial.fibDp(0));
		assertTrue(1 == FibonacciPolynomial.fibDp(1));
	//	System.out.println(FibonacciPolynomial.fibDp(2));
		assertTrue(8 == FibonacciPolynomial.fibDp(5));
		
	}
}
