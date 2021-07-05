package com.logics.t4;
/*
 * created @ Thu Jun 24 2021 10:25:38 am
 * ref @ 
 */

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class _4_Tst {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2000, Month.JANUARY, 1);

        Period period = Period.parse("p-30000y");

        System.out.println(date.plus(period));

    }
}

/*-

Explanation
There are 2 of methods available in LocalDate class: of(int, int, int) and of(int, Month, int). Month can either be passed as int value (1 to 12) or enum constants Month.JANUARY to Month.DECEMBER.



Period.parse(CharSequence) method accepts the String parameter in "PnYnMnD" format, over here P,Y,M and D can be in any case. "p-30000y" means Period of -30000 years. 



The minimum supported LocalDate is: {-999999999-01-01} and maximum supported LocalDate is: {+999999999-12-31}. If period of -30000 years is added to 1st Jan 2000, then result is 1st Jan -28000.

*/
