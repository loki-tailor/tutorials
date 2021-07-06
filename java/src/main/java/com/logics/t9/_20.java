package com.logics.t9;
/*
 * created @ Tue Jul 06 2021 9:19:52 am
 * ref @ 
 */

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class _20 {

    long ticketsSold;
    final AtomicInteger ticketsTaken; // if the constructor is altogether absent, then this will give compile error as
                                      // no value is initialized for this variable

    public _20() { // if the constructor does not initialize the final variable, the compile error
                   // comes saying the same.
        ticketsSold = 0;
        ticketsTaken = new AtomicInteger(0);
    }

    public void performJob() {
        IntStream.iterate(1, p -> p + 1) //
                .parallel()//
                .limit(100)//
                .forEach(i -> ticketsTaken.getAndIncrement());

        IntStream.iterate(1, q -> q + 1) //
                .parallel()//
                .limit(50)//
                .forEach(i -> ++ticketsSold);

        System.out.println(ticketsTaken + " " + ticketsSold);
    }

    public static void main(String[] args) {
        new _20().performJob();
        
    }
}
