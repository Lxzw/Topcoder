package com.l.topcoder.div1_71;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A_Ref124m0 { // 71A

	public static void main(String[] args) throws IOException {
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		int jumlah = Integer.parseInt(BR.readLine());
		String[] kata = new String[jumlah];
		for (int i = 0; i < jumlah; i++) {
			kata[i] = BR.readLine();
		}
		for (int i = 0; i < jumlah; i++) {
			String out = " ";
			if (kata[i].length() > 10) {
				out += kata[i].charAt(0);
				out += kata[i].length() - 2;
				out += kata[i].charAt(kata[i].length() - 1);
			} else {
				out = kata[i];
				System.out.println(" ");
			}

			System.out.println(out);

		}

	}
}

/**
 * @����    ��������forѭ����Ч�ʻ��Ǻܸߣ�BufferedReader��readLine()������System.out.println()
 * 		ͬʱʹ�ã����ܻ�������⡣
 * /
 */