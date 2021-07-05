package com.datetime;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;

/*- @created 02-02-21 */

import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class ManipulatingDatesDemo1 {
    public static void main(String[]  args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMddyyyy");
        
        // 'LocalDate' actually throws DateTimeParseException
        // DateTimeParseException extends DateTimeException extends RuntimeException extends Exception extends Throwable implements Serizable
        LocalDate bday = null; 
        try {
            bday = LocalDate.parse(args[0], formatter); // the format in which the date is going to come for parsing
        } catch (DateTimeException e) {
            System.out.println("bad date loki");
            System.exit(0);
        }

        System.out.println("your birthday is: " + bday);
        System.out.println("which is a: " + bday.getDayOfWeek());

        Period p1 = Period.between(bday, LocalDate.now());

        System.out.println("you've lived for: ");
        System.out.print(p1.getDays() + " days, ");
        System.out.print(p1.getMonths() + " months, ");
        System.out.println(p1.getYears() + " years");

        int yearsOld = p1.getYears();
        if(yearsOld < 0 || yearsOld > 119)
            System.out.println("Wow, you are a time lord?");     

        long tDays = bday.until(LocalDate.now(), ChronoUnit.DAYS); 

        System.out.println("you've lived for " + tDays + " days, so far");
        System.out.println("you'll reach 30,000 days on " + bday.plusDays(30_000));   

        LocalDate d2000 = LocalDate.of(2_000, 1, 1);
        Period p2 = Period.between(d2000, LocalDate.now());
        System.out.println("period since Y2K: " + p2); 
    }
}

/*-
    OUTPUT:

    your birthday is: 1994-09-23
    which is a: FRIDAY
    you've lived for: 
    10 days, 4 months, 26 years
    you've lived for 9629 days, so far
    you'll reach 30,000 days on 2076-11-11
    period since Y2K: P21Y1M1D

*/