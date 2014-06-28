package com.l.codeforce.c235_2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.l.template.util.Info;

public class A {

	public static void main(String[] args) {
		Set<Character> set = new HashSet<Character>();
		
		//获得输入字符串
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine()
				.replace("{", "").replace("}", "")
				.replaceAll(" +", "");
//		System.out.println(string);
//		Info.outArray(string.split(","));
		System.out.println(solve(string.split(",")));
		return;

	}
	
	/**
	 * @功能 统计不重复的字符串长度
	 * @param a
	 * @return
	 */
	
	private static int solve(String[] a) {
		Set<String> set = new HashSet<String>();
		for (int i=0; i<a.length; i++) {
			if (a[i].equals(""))
				continue;
			set.add(a[i]);
		}
		return set.size();
	}
}
