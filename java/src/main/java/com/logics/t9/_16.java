package com.logics.t9;
/*
 * created @ Mon Jul 05 2021 7:51:26 pm
 * ref @ 
 */

import java.util.Optional;
import java.util.stream.Stream;

public class _16 {
    public static void main(String[] args) {
        var stream = Stream.of(1, 2, 3);

        // stream.anyMatch(...); requires predicate

        Optional<Integer> findAny = stream.findAny(); // returns object
        System.out.println(findAny);
        findAny.ifPresent(System.out::println);
        System.out.println("*".repeat(100));

        // stream.first(); // compile error

        stream = Stream.of(1, 2, 3);

        Optional<Integer> findFirst = stream.findFirst(); // returns object
        System.out.println(findFirst);
        findFirst.ifPresent(System.out::println);
        System.out.println("*".repeat(100));

        stream = Stream.of(1, 2, 3);

        // stream.min(...) // takes argument

    }

}
