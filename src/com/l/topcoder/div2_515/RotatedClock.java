package com.l.topcoder.div2_515;

public class RotatedClock {
	
	public static String getEarliest(int hourHander, int minHander) {
		int hour = 0, min = 0;
		//通过时钟和分钟的角度来算出 00:00 的位置
		int remainer = hourHander % 30;
		int twelveHander = minHander - remainer * 2 * 6;
		min = remainer * 2;
		//判断是否在时钟的刻度上
		if ((twelveHander % 30) != 0) return "";
		//以00:00为标准重新计算hour
		//00:00在hour的左边
		if (twelveHander >= hourHander) {
			 hour = (360 - (twelveHander - hourHander)) / 30 ;
		}
		
		if (twelveHander < hourHander) {
			hour = (hourHander - twelveHander) / 30;
		}
		//格式化字符串返回
		String hourStr = "";
		if (hour < 10) {
			hourStr = "0" + String.valueOf(hour);
		} else {
			hourStr = String.valueOf(hour);
		}
		String minStr = "";
		if (min < 10) {
			minStr = "0" + String.valueOf(min);
		} else {
			minStr = String.valueOf(min);
		}
		
		return hourStr +":" + minStr;
	}
	
}
