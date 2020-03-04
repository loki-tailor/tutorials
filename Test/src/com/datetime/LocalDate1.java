package com.datetime;

/**
	created @ 22-01-2020
	@author lokeshwar
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDate1 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.parse("2018-04-30",DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println(date);
		date.plusDays(2);

		// below line will give compilation error, since LocalDate does not have time element, however,
		// LocalDateTime does have time element.
		//date.plusHours(3);
		System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
	}

} // end of class