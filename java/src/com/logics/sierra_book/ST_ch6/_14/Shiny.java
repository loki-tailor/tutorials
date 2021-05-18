package com.logics.sierra_book.ST_ch6._14;

/*- created = 17-05-21 */

import java.time.*;
import java.time.format.*;

public class Shiny {
    public static void main(String[] args) {
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MMM dd, yyyy");
        LocalDate d = LocalDate.of(2018, Month.JANUARY, 15);
        LocalDate d2 = d.plusDays(1);
        System.out.print(f1.format(d) + " ");
        System.out.println(d2.format(f1));
    }
}

// output: Jan 15, 2018 Jan 16, 2018

// both LocalDate & DateTimeFormatter have format() method