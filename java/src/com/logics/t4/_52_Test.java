package com.logics.t4;

import java.time.LocalDate;
import java.time.Period;

public class _52_Test {
    public static void main(String[] args) {

        LocalDate o = new LocalDate(2020, 2, 14);

        System.out.println(o.minus(Period.ofDays(10)));
    }
}

/*-

Explanation
Constructor of LocalDate is declared private so cannot be called from outside, hence new LocalDate(2020, 2, 14); causes compilation failure. 



Overloaded static methods "of" and "parse" are provided to create the instance of LocalDate. 

LocalTime, LocalDateTime, Period also specify private constructors and provide "of" and "parse" methods to create respective instances.

*/