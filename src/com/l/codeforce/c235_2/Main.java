package com.l.codeforce.c235_2;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		solve();
		return;
	}

	static void solve() {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int x = scn.nextInt();
		Integer[] c = new Integer[n];
		for (int i = 0; i < n; i++) {
			c[i] = scn.nextInt();
		}
		Arrays.sort(c);
		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum += (long) x * (long) c[i];
			if (1 < x) {
				x--;
			}
		}
		System.out.println(sum);
		return;
	}
}