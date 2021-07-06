package com.logics.t9;
/*
 * created @ Mon Jul 05 2021 8:22:50 pm
 * ref @ 
 */

import java.util.function.BiFunction;

public class _18 {

    // public void mine(_______ lambda)

    // public void mine(BiConsumer<Integer, Double> lambda) { // error

    // public void mine(BiConsumer<Integer, Integer> lambda) { // error

    public void mine(BiFunction<Integer, Double, Double> lambda) { // no error

        // public void mine(BiFunction<Integer, Integer, Double> lambda) {
        // in above even thought 2 args seems to be right , but the result will not be
        // double, hence the error
        // implementation omitted
    }

    public static void main(String[] args) {
        new _18().mine((s, p) -> s + p);

        new _18().mine((Integer s, Double p) -> s + p);

        // new _18().mine((Double s, Integer p) -> s + p); // error

        Integer i1 = 10;
        Integer i2 = 20;
        Double d1 = 30.2;

        // int r1 = i1 + d1; // error: Type mismatch: cannot convert from double to
        // intJava(16777233)

        // Integer r2 = d1 + i2; // error Type mismatch: cannot convert from double to
        // IntegerJava(16777233)

    }
}
