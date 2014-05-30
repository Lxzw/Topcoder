package com.l.topcoder.div2_621;

public class TwoWaysSorting {

	public static String sortingMethod(String[] stringlist) {
		
		boolean islengths = true;
		boolean islexicographically = true;
		
	
		if (stringlist.length == 1 || stringlist.length == 0) {
		     islengths = true ;
		     islexicographically = true;
		}
		
		//judge "islengths"
		for (int i = 1; i < stringlist.length; i++) {
			if (stringlist[i].length() < stringlist[i-1].length()) {
				islengths = false;
				break;
			}
		}
		
		//judge "islexicographically"
		for (int i = 1; i < stringlist.length; i++) {
			if (stringlist[i].charAt(0) == stringlist[i-1].charAt(0)) {
				if (stringlist[i].length() < stringlist[i-1].length()) {
					islexicographically = false;
					break;
				}
				if (stringlist[i].compareTo(stringlist[i-1]) > 0) {
					islexicographically = false;
					break;
				}
			} else if (stringlist[i].charAt(0) < stringlist[i-1].charAt(0)) {
				 islexicographically = false;
				 break;
			} else if (stringlist[i].charAt(0) > stringlist[i-1].charAt(0)) {
				islexicographically = true;
			} else {
				islexicographically = false;
				break;
			}
		}
		
		if (islengths && islexicographically) {
			return "both";
		}
		if (islengths) {
			return "lengths";
		}
		if (islexicographically) {
			return "lexicographically";
		} else {
			return "none";
		}
		

	}
}
