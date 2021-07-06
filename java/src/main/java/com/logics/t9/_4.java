package com.logics.t9;
/*
 * created @ Mon Jul 05 2021 11:01:38 am
 * ref @ 
 */

import java.util.List;

public class _4 {
    public static void main(String... legnds) {

        List.of(1, 2, 3, 4).stream().forEach(System.out::print);
        System.out.println();

        List.of(1, 2, 3, 4).stream().forEachOrdered(System.out::print);
        System.out.println();

        // List.of(1, 2, 3, 4).parallel().forEach(System.out::println);
        List.of(1, 2, 3, 4).parallelStream().forEach(System.out::print);
        System.out.println();

        // List.of(1, 2, 3, 4).parallel().forEachOrdered(System.out::println);
        List.of(1, 2, 3, 4).parallelStream().forEachOrdered(System.out::print);
        System.out.println();

    }
}

/*
 * A List instance, which inherits the Collection interface, does not have a
 * parallel() method. Instead, parallelStream() must be used, making option F
 * correct. If the codembda Expressions 491 was corrected to use
 * parallelStream(), then the first and third streams would be consistently
 * printed in the same order. Remember that the forEachOrdered() method forces
 * parallel streams to run in sequential order. The order of the second
 * operation would be unknown ahead of time, since it uses a parallel stream.
 * 
 */