package com.logics.t9;
/*
 * created @ Tue Jul 06 2021 5:35:30 am
 * ref @ 
 */

import java.util.stream.DoubleStream;

public class _25 {
    public static void main(String[] args) {
        DoubleStream ds = DoubleStream.generate(() -> 10.4);
        ds.average(); // OptionalDouble
        ds.sum(); // double
        ds.count(); // long
        ds.max(); // OptionalDouble
    }
} //
