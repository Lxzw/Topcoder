package com.l.topcoder.div1_71;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		try {
		//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//	int times = br.read();//timesÊÇascIIµÄÖµ
		//	System.out.println(times-48);
			Scanner scanner = new Scanner(System.in);
			int times = scanner.nextInt();
			int i = 0;
			String string = null;
			while (i < times) {
				string = scanner.next();
				if (string.length() < 11) {
					System.out.println(string);
				} else {
					System.out.println(string.charAt(0)
							+""+(string.length()-2)
							+""+string.charAt(string.length()-1));
				}
			//	br.readLine();
				i++;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		//input
		//solve
	}
}
