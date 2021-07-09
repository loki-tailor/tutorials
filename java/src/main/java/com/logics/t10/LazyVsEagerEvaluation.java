package com.logics.t10;
/*
 * created @ Tue Jul 06 2021 10:04:08 am
 * ref @ https://youtu.be/gq8VClqwqD4?list=PLUDxEIP1X623utgoHn0ptWwWSvUIefzNy&t=533
 */

import java.util.function.Supplier;

public class LazyVsEagerEvaluation {

    private static boolean compute(String str) {
        System.out.println("executing compute()..");
        return str.contains("a");
    }

    private static String eagerMatch(boolean b1, boolean b2) {
        return b1 && b2 ? "eager matched" : "eager imcompatible";
    }

    private static String lazyMatch(Supplier<Boolean> s1, Supplier<Boolean> s2) {
        return s1.get() && s2.get() ? "lazy matched" : "lazy incompatible";
    }

    public static void main(String[] args) {
        System.out.println(eagerMatch(compute("ss"), compute("aa")));
        System.out.println(lazyMatch(() -> compute("ss"), () -> compute("aa")));
        
    }
}
