package com.l.codeforce.c235_2;

import java.util.*;
import java.io.*;

public class A_Ref62m {

	BufferedReader in;
	StringTokenizer str = null;
	PrintWriter out;

	private String next() throws Exception {
		while (str == null || !str.hasMoreElements())
			str = new StringTokenizer(in.readLine());
		return str.nextToken();
	}

	private int nextInt() throws Exception {
		return Integer.parseInt(next());
	}

	private long nextLong() throws Exception {
		return Long.parseLong(next());
	}

	private double nextDouble() throws Exception {
		return Double.parseDouble(next());
	}

	public void run() throws Exception {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		char[] a = in.readLine().toCharArray();
		Set<Character> set = new HashSet<Character>();
		for (char i : a) {
			if (i >= 'a' && i <= 'z') {
				set.add(i);
			}
		}
		out.println(set.size());
		out.close();
	}

	public static void main(String[] args) throws Exception {
		new A_Ref62m().run();
	}

}
