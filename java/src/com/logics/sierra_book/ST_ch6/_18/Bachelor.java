package com.logics.sierra_book.ST_ch6._18;

/*- @created = 17-05-21 */

import java.time.*;

public class Bachelor {
    public static void main(String[] args) {
        LocalDate d = LocalDate.of(2018, 8, 15);
        d = d.plusDays(1); // at this point, the 'LocalDate.of(..)' object is ready for GC
        LocalDate d2 = d.plusDays(1);
        LocalDate d3 = d2;
        d2 = d2.plusDays(1); // ?? will the original d2, be available for GC?
        System.out.print(d + " " + d2 + " " + d3); // line X
    }
}

// output: 2018-08-16 2018-08-18 2018-08-17