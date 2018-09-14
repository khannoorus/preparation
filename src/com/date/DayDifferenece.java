package com.date;

import java.util.Date;

public class DayDifferenece {

	public static void main(String[] args) {
		Date d1=new Date();
		Date d2 = new Date();
		System.out.println(d1.getTime() + " "+ d2.getTime()+ " " +getDifferenceDays(d1,d2));

	}

	public static int getDifferenceDays(Date d1, Date d2) {
		int daysdiff=0;
		long diff = d2.getTime() - d1.getTime();
		long diffDays = diff / (24 * 60 * 60 * 1000)+1;
		daysdiff = (int) diffDays;
		return daysdiff;
	}

}
