package com.logics.t1;

import java.time.LocalDate;

class MyLocalDate extends LocalDate {
	@Override
	public String toString() {
		return super.getDayOfMonth() + "-" + super.getMonthValue() + "-" + super.getYear();
	}
}

public class _18_Test {
	public static void main(String[] args) {
		MyLocalDate date = LocalDate.parse("1980-03-16");
		System.out.println(date);
	}
}

/***
 * Explanation LocalDate is a final class so cannot be extended.
 */