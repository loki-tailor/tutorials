package com.logics.t9;
/*
 * created @ Mon Jul 05 2021 7:37:16 pm
 * ref @ 
 */

import java.util.stream.IntStream;

public class _14 {

    void charge() {
        IntStream.range(1, 6).parallel().forEachOrdered(System.out::println);
    }

    public static void main(String[] args) {
        var o = new _14();
        o.charge();
    }
}

/*-
Even though a parallel stream is used, the forEachOrdered() method forces the
stream to operate in the order of its data source. The code compiles and runs without issue
printing 12345 every time, and making option A correct. If forEach() was used instead,
then the output would vary at runtime.
*/