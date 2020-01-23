package com.datetime;

/**
	created @ 22-01-2020
	@author lokeshwar
*/

import java.time.LocalDate;
import java.time.Month;

public class LocalDate2 {
	public static void main(String[] args) {
		// below line will through RunTimeException as java.time.DateTimeException: Invalid value for DayOfMonth (valid values 1 - 28/31): 40
		LocalDate date = LocalDate.of(2018,Month.APRIL,40);
		System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
	}
}