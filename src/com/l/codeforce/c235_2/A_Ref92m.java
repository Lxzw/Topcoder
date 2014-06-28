package com.l.codeforce.c235_2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by rafael on 6/19/14.
 */
public class A_Ref92m {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] set = sc.nextLine().toCharArray();

		if (set.length == 2) {
			System.out.println(0);
		} else {
			Set<Character> s = new HashSet<Character>();
			for (int i = 1; i < set.length; i += 3) {
				s.add(set[i]);
			}

			System.out.println(s.size());
		}
	}
}
//在{a,b,c,d}测试用例中不能通过