package com.Utilities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtility {
	public static String getDateBasedOnNumberOfDays(String format, int numberOfDays) {

		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, numberOfDays);
		SimpleDateFormat s = new SimpleDateFormat(format);
		return s.format(new Date(cal.getTimeInMillis()));
	}

	public static String getDateBasedOnNumberOfMonths(String format, int numberOfMonths) {

		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, numberOfMonths);
		SimpleDateFormat s = new SimpleDateFormat(format);
		return s.format(new Date(cal.getTimeInMillis()));
	}

	public static String getDateBasedOnNumberOfYears(String format, int numberOfYears) {

		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR, numberOfYears);
		SimpleDateFormat s = new SimpleDateFormat(format);
		return s.format(new Date(cal.getTimeInMillis()));
	}

	public static void main(String[] args) {
		
		System.out.println(getDateBasedOnNumberOfDays("dd MM yyyy HH:mm:ss", -3));
		System.out.println(getDateBasedOnNumberOfDays("dd/MM/yyyy", -3));
		System.out.println(getDateBasedOnNumberOfDays("dd MMM yyyy", -3));
	}
}
