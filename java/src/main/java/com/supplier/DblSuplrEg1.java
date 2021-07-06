package com.supplier;
/*
 * created @ Mon Jul 05 2021 3:43:38 pm
 * ref @ http://www.java2s.com/Tutorials/Java/java.util.function/DoubleSupplier/index.htm
 */

import java.util.function.DoubleSupplier;

public class DblSuplrEg1 {
    public static void main(String[] args) {
        DoubleSupplier pi = () -> 3.14d;

        System.out.println(pi.getAsDouble());
    }
}
