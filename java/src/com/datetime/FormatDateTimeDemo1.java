package com.datetime;

/*- @created 02-02-21 */

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.LocalTime;


public class FormatDateTimeDemo1 {
    public static void main(String[] args) {
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MMM dd, yyyy");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("E MM dd, yyyy G");
        DateTimeFormatter tf1 = DateTimeFormatter.ofPattern("k:m:s A a");

        LocalDate d = LocalDate.now();
        
        System.out.println("LocalDate.now() = " + d);
        System.out.println("DateTimeFormatter.ofPattern(\"MMM dd, yyyy\") = " + d.format(f1));
        System.out.println("DateTimeFormatter.ofPattern(\"E MM dd, yyyy G\") =" + d.format(f2));

        // below will give exception, since we are trying to parse a LocalDate into a 'LocalTime' formatter
        // System.out.println("DateTimeFormatter.ofPattern(\"k:m:s A a\") = " + d.format(tf1));
        /*-

        Exception in thread "main" java.time.temporal.UnsupportedTemporalTypeException: Unsupported field: ClockHourOfDay
        at java.time.LocalDate.get0(Unknown Source)
        at java.time.LocalDate.getLong(Unknown Source)
        at java.time.format.DateTimePrintContext.getValue(Unknown Source)
        at java.time.format.DateTimeFormatterBuilder$NumberPrinterParser.format(Unknown Source)
        at java.time.format.DateTimeFormatterBuilder$CompositePrinterParser.format(Unknown Source)
        at java.time.format.DateTimeFormatter.formatTo(Unknown Source)
        at java.time.format.DateTimeFormatter.format(Unknown Source)
        at java.time.LocalDate.format(Unknown Source)
        at com.datetime.FormatDateTimeDemo1.main(FormatDateTimeDemo1.java:20)
        */

        LocalTime t = LocalTime.now();
        System.out.println("DateTimeFormatter.ofPattern(\"k:m:s A a\") = " + t.format(tf1));
    }
}

/*-

    SAMPLE OUTPUT:

    LocalDate.now() = 2021-02-02
    DateTimeFormatter.ofPattern("MMM dd, yyyy") = Feb 02, 2021
    DateTimeFormatter.ofPattern("E MM dd, yyyy G") =Tue 02 02, 2021 AD
    DateTimeFormatter.ofPattern("k:m:s A a") = 6:11:34 22294391 AM

*/