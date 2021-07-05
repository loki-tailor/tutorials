package com.logics.t1;

import java.time.LocalDate;

public class _39_Test {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, 9, 31);
        System.out.println(date);
    }
}

/*-

Explanation
LocalDate.of(...) method first validates year, then month and finally day of the month. 

September can't have 31 days so LocalDate.of(...) method throws an instance of java.time.DateTimeException class.

*/
