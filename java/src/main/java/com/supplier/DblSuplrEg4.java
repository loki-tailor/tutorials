package com.supplier;
/*
 * created @ Mon Jul 05 2021 7:29:57 pm
 * ref @ https://www.tutorialspoint.com/how-to-implement-doublesupplier-using-lambda-and-method-reference-in-java
 */

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.DoubleSupplier;

public class DblSuplrEg4 {
    public static void main(String[] args) {
        DoubleSupplier supplier = () -> { //
            double val = ThreadLocalRandom.current().nextDouble(0000, 9999); //
            return Math.round(val);//
        };

        double randomVal = supplier.getAsDouble();
        System.out.println(randomVal);
        System.out.println("Random Double Value Generated = " + supplier.getAsDouble());
        System.out.println("Random Double Value Generated = " + randomVal);
        System.out.println("Random Double Value Generated = " + supplier.getAsDouble());
        System.out.println("Random Double Value Generated = " + supplier.getAsDouble());
    }
}
