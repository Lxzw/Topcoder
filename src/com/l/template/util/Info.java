package com.l.template.util;


public class Info {
	
	public static void outString(String s) {
		System.out.println(s);
	}
	
	public static <T> void  outArray(T[] a) {
		for (int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
