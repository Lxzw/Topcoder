package com.l.topcoder.div2_515;

import java.util.ArrayList;
import java.util.List;

public class FortunateNumbers {
	//O(n3*lgn)
	public static int getFortunate(int[] a, int[] b, int[] c) {
		//a[i] + b[j] + c[k]所有的和进行判断
		List<Integer> container = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			for(int j = 0; j < b.length; j++) {
				for(int k = 0; k < c.length; k++) {
				   int fortunate = a[i] + b[j] + c[k];
				   insertContainer(container,judgeFortunate(fortunate));
				}
			}
		}
		return container.size();
	}
	
	//O(n) --
	private static void insertContainer(List<Integer> container,
			int judgeFortunate) {
		if (judgeFortunate == -1) return; 
		
		boolean isExist = false;
		for (int i : container) {
			if (i == judgeFortunate) isExist = true;
		}
		if (!isExist) {
			container.add(judgeFortunate);
		}
	}
	//O(1)  按位判断值是否是幸运数（5 或 8）
	private static int judgeFortunate(int fortunate) {
		int decimal = 10;
		int temp = fortunate;
		while (temp > 0 ) {
			int remainer = temp%decimal;
			if (remainer != 5 && remainer != 8) {
				return -1;
			}
			temp = temp / decimal;
		}
		
		return fortunate;
	}
	
}
