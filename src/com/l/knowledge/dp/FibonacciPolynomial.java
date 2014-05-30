package com.l.knowledge.dp;

public class FibonacciPolynomial {
	
	public static int fib(int n) { 
		if (n == 0 || n == 1) { 
			return 1;
		}
		return fib(n-1) + fib(n-2);
	}
	
	public static int fibDp(int n) {
		int curr = 1, pre = 1, temp = 0;
		
		if (n == 0 || n == 1) {
			return curr;
		}
		
		for (int i = 2; i <= n; i++) {
			temp = curr;
			curr = curr + pre;
			pre  = temp; 
		}
		
		return curr;
	}
	
}
