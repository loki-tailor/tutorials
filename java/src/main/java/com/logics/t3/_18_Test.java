package com.logics.t3;
/*
 * created @ Tue Jun 22 2021 3:24:45 pm
 * ref @ 
 */

import java.time.LocalDate;
import java.time.Period;

public class _18_Test {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("2000-01-01");
        Period p = Period.ofYears(-1000);
        System.out.println(date.plus(p));
    }
}

/*-
Explanation
The minimum supported LocalDate is: {-999999999-01-01} and maximum supported LocalDate is: {+999999999-12-31}.

If period of -3000 years is added to 1st Jan 2000, then result is 1st Jan -1000.
*/