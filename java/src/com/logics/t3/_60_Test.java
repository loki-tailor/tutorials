package com.logics.t3;

import java.time.LocalDate;

/*
 * created @ Wed Jun 23 2021 9:46:07 am
 * ref @ 
 */

public class _60_Test {
    public static void main(String[] args) {
        LocalDate newYear = LocalDate.of(2018, 1, 1);
        LocalDate eventDate = LocalDate.of(2018, 1, 1);
        boolean flag1 = newYear.isAfter(eventDate);
        boolean flag2 = newYear.isBefore(eventDate);
        System.out.println(flag1 + ":" + flag2);
    }
}

/*-

Explanation
isAfter and isBefore method can be interpreted as:

Does 1st Jan 2018 come after 1st Jan 2018? No, false.  Does 1st Jan 2018 come before 1st Jan 2018? No, false.

*/