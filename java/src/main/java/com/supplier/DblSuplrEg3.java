package com.supplier;
/*
 * created @ Mon Jul 05 2021 3:59:39 pm
 * ref @ https://www.concretepage.com/java/java-8/java-doublesupplier
 */

import java.util.Random;
import java.util.function.DoubleSupplier;
import java.util.stream.DoubleStream;

public class DblSuplrEg3 {
    public static void main(String[] args) {
        double output = getRes(() -> Double.max(13.56, 3.146));
        System.out.println(output);

        System.out.println("--- With DoubleStream.generate() ---");
        DoubleStream limit = DoubleStream.generate(() -> new Random().nextDouble()).limit(10);
        limit.forEach(System.out::println);
    }

    static double getRes(DoubleSupplier ds) {
        return ds.getAsDouble() * 100;
    }
}
