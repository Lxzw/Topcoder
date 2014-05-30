package com.l.knowledge.dp;

import java.util.ArrayList;

public class Triangle {

	private static int minPath(ArrayList<ArrayList<Integer>> triangle,
			int index, int level) {
		if (level == triangle.size() - 1) {
			return triangle.get(level).get(index);
		} else {
			int current = triangle.get(level).get(index);
			int nextFirst = minPath(triangle, index, level + 1);
			int nextSecond = minPath(triangle, index + 1, level + 1);

			int nextFirstTotal = nextFirst + current;
			int nextSecondTotal = nextSecond + current;

			return (nextFirstTotal < nextSecondTotal ? nextFirstTotal
					: nextSecondTotal);
		}
	}

	public static int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
		if (triangle.size() == 0) return 0;
		return minPath(triangle, 0, 0);
 	}

}