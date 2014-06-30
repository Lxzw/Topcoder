package com.l.topcoder.div1_71;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Map;
//import java.util.Set;
import java.util.StringTokenizer;

public class A_Ref124m {

	static class FastScanner {
		BufferedReader s;
		StringTokenizer st;

		public FastScanner() {
			st = new StringTokenizer("");
			s = new BufferedReader(new InputStreamReader(System.in));
		}

		public int nextInt() throws IOException {
			if (st.hasMoreTokens())
				return Integer.parseInt(st.nextToken());
			else {
				st = new StringTokenizer(s.readLine());
				return nextInt();
			}
		}

		public String nextString() throws IOException {
			if (st.hasMoreTokens())
				return st.nextToken();
			else {
				st = new StringTokenizer(s.readLine());
				return nextString();
			}

		}
	}

	public static void main(String[] args) throws IOException {
		FastScanner s = new FastScanner();
		PrintWriter ww = new PrintWriter(new OutputStreamWriter(System.out));
		int test = s.nextInt();
		while (test-- > 0) {
			String str = s.nextString();
			int len = str.length();
			if (len < 11)
				ww.println(str);
			else {
				StringBuffer ans = new StringBuffer();
				ww.println(ans.append(str.charAt(0)).append(len - 2)
						.append(str.charAt(len - 1)));
			}
		}

		ww.close();
	}
}

/**
 * @解释 利用了 字符缓存流，PrinterWriter，StringBuffer等基础类来提高效率
 */
