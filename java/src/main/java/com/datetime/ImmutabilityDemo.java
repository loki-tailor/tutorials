package com.datetime;

/*-
    @created 01-02-2021
*/

import java.time.LocalDate;
import java.time.Period;

public class ImmutabilityDemo {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2017,1,31);
        Period period1 = Period.ofMonths(1);
        Period period2 = Period.of(0,0,0);
        
        System.out.println("\nLocalDate.of(2017,1,31) = date1 = " + date1 + " @ " + date1.hashCode());
        System.out.println("Period.ofMonths(1); = period1 = " + period1 + " @ " + period1.hashCode());
        System.out.println("Period.of(0,0,0) = period2 = " + period2 + " @ " + period2.hashCode());

        date1.plus(period1); // new value is lost
        System.out.println();
        System.out.println("LocalDate.of(2017,1,31) = date1 = " + date1 + " @ " + date1.hashCode());
        System.out.println("Period.ofMonths(1); = period1 = " + period1 + " @ " + period1.hashCode());

        LocalDate date2 = date1.plus(period1); // new value is captured
        System.out.println("\nLocalDate.of(2017,1,31) = date1 = " + date1 + " @ " + date1.hashCode());
        System.out.println("LocalDate.of(2017,1,31) = date2 = " + date2 + " @ " + date2.hashCode());
        System.out.println("Period.ofMonths(1); = period1 = " + period1 + " @ " + period1.hashCode());                

    }
} 


/*-
    OUTPUT:

    LocalDate.of(2017,1,31) = date1 = 2017-01-31 @ 4130911
    Period.ofMonths(1); = period1 = P1M @ 256

    LocalDate.of(2017,1,31) = date1 = 2017-01-31 @ 4130911
    Period.ofMonths(1); = period1 = P1M @ 256

    LocalDate.of(2017,1,31) = date1 = 2017-01-31 @ 4130911
    LocalDate.of(2017,1,31) = date2 = 2017-02-28 @ 4130972
    Period.ofMonths(1); = period1 = P1M @ 256
    
*/