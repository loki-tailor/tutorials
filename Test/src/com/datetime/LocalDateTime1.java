package com.datetime;

/**
	created @ 23-01-2020
	@author lokeshwar

	Note: it is observed that when the last line is printed,
	the value of time is displayed in 24hr (13:32) format, I need to understand,
	in which cases will it be 12hr (i.e 01:32 pm) and which cases 24 hr,
	is it system clock dependent or there's some mechanism in Java ?
*/

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LocalDateTime1 {
	public static void main(String[] args) {
		
		// syntax => LocalDateTime.of(int year, int month, int dayOfMonth, int hour, int minute, int second)
		LocalDateTime d = LocalDateTime.of(2015,5,10,13,22,33);

		// syntax => Periods.of(int years, int months, int days)
		Period p = Period.of(1,2,3);
		d = d.minus(p);

		DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		System.out.println(d.format(f));
		
	}
}