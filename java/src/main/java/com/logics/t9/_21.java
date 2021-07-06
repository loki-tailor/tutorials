package com.logics.t9;
/*
 * created @ Tue Jul 06 2021 9:07:17 am
 * ref @ 
 */

import java.util.Random;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class _21 {
    public static void main(String[] args) {
        Supplier<IntStream> s = () -> new Random().ints().limit(2);

        s.get().filter(n -> true).forEach(System.out::println); // 0 or more outputs
        System.out.println("-".repeat(50));

        s.get().flatMap(n -> new Random().ints().limit(0)).forEach(System.out::println); // 0 or more outputs
        System.out.println("-".repeat(50));

        s.get().map(n -> n).forEach(System.out::println);
        System.out.println("-".repeat(50));
    }
}
