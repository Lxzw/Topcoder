package com.l.codeforce.c235_2;
/*
 * To change this template, choose Tools | Templates and open the template
 * in the editor.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


/**
 * 
 * @author MojtabaPC
 */
public class A_reference1 {


	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		String line = reader.readLine();
		ArrayList<String> list = new ArrayList<>();
		line = line.substring(1, line.length() - 1);
		String[] a = line.split(", ");
		if (!line.equals("")) {
			for (String s : a) {
				if (!list.contains(s)) {
					list.add(s);
				}
				System.err.println(s);
			}
		}
		System.out.println(list.size());
	}
}
