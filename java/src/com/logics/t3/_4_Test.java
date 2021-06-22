package com.logics.t3;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class _4_Test {
    public static void main(String[] args) {
        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.parse("2018-7-11"));
        dates.add(LocalDate.parse("1919-10-25"));
        dates.add(LocalDate.of(2020, 4, 8));
        dates.add(LocalDate.of(1980, Month.DECEMBER, 31));

        dates.removeIf(x -> x.getYear() < 2000);

        System.out.println(dates);
    }
}   

/*-

Explanation
LocalDate.parse(CharSequence text) method accepts String in "9999-99-99" format only, in which month and day part in the passed object referred by text should be of 2 digits, such as to represent MARCH, use 03 and not 3 & to represent 4th day of the month, use 04 and not 4.

Single digit month and day value are not automatically padded with 0 to convert it to 2 digits. 

To represent 9th June 2018, format String must be "2018-06-09".

If you pass "2018-6-9" or "2018-06-9" or "2018-6-09" (not in correct formats), then an instance of java.time.format.DateTimeParseException will be thrown. 

In this question, LocalDate.parse("2018-7-11") throws an exception at runtime as JULY is represented as 7, whereas it should be represented as 07.

*/
