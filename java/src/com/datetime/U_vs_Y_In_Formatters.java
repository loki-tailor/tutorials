package com.datetime;
/*
 * created @ Fri Jun 25 2021 7:55:50 am
 * ref @ https://stackoverflow.com/a/65928023/7415499
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class U_vs_Y_In_Formatters {
    public static void main(String[] args) {
        System.out.println("LocalDate.of(-1, 1, 1).format(DateTimeFormatter.ofPattern(\"u M d\") = "
                + LocalDate.of(-1, 1, 1).format(DateTimeFormatter.ofPattern("u M d")));

        System.out.println("LocalDate.of(-1, 1, 1).format(DateTimeFormatter.ofPattern(\"y M d\") = "
                + LocalDate.of(-1, 1, 1).format(DateTimeFormatter.ofPattern("y M d")));

        System.out.println("LocalDate.of(-1, 1, 1).format(DateTimeFormatter.ofPattern(\"yG M d\") = "
                + LocalDate.of(-1, 1, 1).format(DateTimeFormatter.ofPattern("yG M d")));

        System.out.println();

        System.out.println("LocalDate.of(0, 1, 1).format(DateTimeFormatter.ofPattern(\"u M d\") = "
                + LocalDate.of(0, 1, 1).format(DateTimeFormatter.ofPattern("u M d")));

        System.out.println("LocalDate.of(0, 1, 1).format(DateTimeFormatter.ofPattern(\"y M d\") = "
                + LocalDate.of(0, 1, 1).format(DateTimeFormatter.ofPattern("y M d")));

        System.out.println("LocalDate.of(0, 1, 1).format(DateTimeFormatter.ofPattern(\"yG M d\") = "
                + LocalDate.of(0, 1, 1).format(DateTimeFormatter.ofPattern("yG M d")));

        System.out.println();

        System.out.println("LocalDate.of(1, 1, 1).format(DateTimeFormatter.ofPattern(\"u M d\") = "
                + LocalDate.of(1, 1, 1).format(DateTimeFormatter.ofPattern("u M d")));

        System.out.println("LocalDate.of(1, 1, 1).format(DateTimeFormatter.ofPattern(\"y M d\") = "
                + LocalDate.of(1, 1, 1).format(DateTimeFormatter.ofPattern("y M d")));

        System.out.println("LocalDate.of(1, 1, 1).format(DateTimeFormatter.ofPattern(\"yG M d\") = "
                + LocalDate.of(1, 1, 1).format(DateTimeFormatter.ofPattern("yG M d")));

    }
}

/*-

output:

LocalDate.of(-1, 1, 1).format(DateTimeFormatter.ofPattern("u M d") = -1 1 1
LocalDate.of(-1, 1, 1).format(DateTimeFormatter.ofPattern("y M d") = 2 1 1
LocalDate.of(-1, 1, 1).format(DateTimeFormatter.ofPattern("yG M d") = 2BC 1 1

LocalDate.of(0, 1, 1).format(DateTimeFormatter.ofPattern("u M d") = 0 1 1
LocalDate.of(0, 1, 1).format(DateTimeFormatter.ofPattern("y M d") = 1 1 1
LocalDate.of(0, 1, 1).format(DateTimeFormatter.ofPattern("yG M d") = 1BC 1 1

LocalDate.of(1, 1, 1).format(DateTimeFormatter.ofPattern("u M d") = 1 1 1
LocalDate.of(1, 1, 1).format(DateTimeFormatter.ofPattern("y M d") = 1 1 1
LocalDate.of(1, 1, 1).format(DateTimeFormatter.ofPattern("yG M d") = 1AD 1 

*/
