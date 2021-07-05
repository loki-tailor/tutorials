package com.logics.t4;

import java.time.LocalDate;

public class _9_Tst {
    public static void main(String[] args) {

        LocalDate date = LocalDate.parse("2016-04-30");

        System.out.println(date.withDayOfYear(29));

        System.out.println(date.withDayOfYear(365));

        System.out.println(date.withDayOfYear(366));

        System.out.println(date.withDayOfMonth(30));

        System.out.println(date.withMonth(12));

        System.out.println(date.withYear(1994));

        System.out.println(date);

        System.out.println(date.withDayOfYear(0));
        // above gives below error
        // Exception in thread "main" java.time.DateTimeException: Invalid value for
        // DayOfYear (valid values 1 - 365/366): 0

        // System.out.println(date.withDayOfYear(367));
        // above gives: Exception in thread "main" java.time.DateTimeException: Invalid
        // value for DayOfYear (valid values 1 - 365/366): 367

    }
}
