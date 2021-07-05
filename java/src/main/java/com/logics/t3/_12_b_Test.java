package com.logics.t3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class _12_b_Test {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2012, 1, 11);
        Period p = Period.ofYears(10);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("mm-dd-yy");
        System.out.println(formatter.format(date.minus(p)));
    }
}

/*-

Explanation
While working with dates, programmers get confused with M & m and D & d. 

Easy way to remember is that Bigger(Upper case) letters represent something bigger. M represents month & m represents minute, D represents day of the year & d represents day of the month. 



LocalDate's object doesn't have time component, mm represents minute and not months so at runtime format method throws exception.

*/
