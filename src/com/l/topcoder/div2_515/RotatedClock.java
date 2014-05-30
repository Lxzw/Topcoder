package com.l.topcoder.div2_515;

public class RotatedClock {
	
	public static String getEarliest(int hourHander, int minHander) {
		int hour = 0, min = 0;
		//ͨ��ʱ�Ӻͷ��ӵĽǶ������ 00:00 ��λ��
		int remainer = hourHander % 30;
		int twelveHander = minHander - remainer * 2 * 6;
		min = remainer * 2;
		//�ж��Ƿ���ʱ�ӵĿ̶���
		if ((twelveHander % 30) != 0) return "";
		//��00:00Ϊ��׼���¼���hour
		//00:00��hour�����
		if (twelveHander >= hourHander) {
			 hour = (360 - (twelveHander - hourHander)) / 30 ;
		}
		
		if (twelveHander < hourHander) {
			hour = (hourHander - twelveHander) / 30;
		}
		//��ʽ���ַ�������
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
