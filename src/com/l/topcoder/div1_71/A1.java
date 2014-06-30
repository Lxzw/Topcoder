package com.l.topcoder.div1_71;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @描述 用BufferedReader来实现 div1 71A
 * @author XZW
 *
 */
public class A1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		int times = Integer.parseInt(bReader.readLine());
		String[] strings = new String[times];
		for (int i=0; i<times; i++) {
			strings[i] = bReader.readLine();
		}
		
		//System.out.println(times);
		for (int i=0; i<times; i++) {
			int len = strings[i].length();
			if (strings[i].length()<11) {
				System.out.println(strings[i]);
			} else {
				System.out.println(strings[i].charAt(0) 
						+ "" + (len-2) 
						+ "" + strings[i].charAt(len-1));
			}
		}
	}
}

//124m BufferedReader效率提升比较明显