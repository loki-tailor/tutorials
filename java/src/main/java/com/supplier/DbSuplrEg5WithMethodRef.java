package com.supplier;
/*
 * created @ Mon Jul 05 2021 7:33:13 pm
 * ref @ https://www.tutorialspoint.com/how-to-implement-doublesupplier-using-lambda-and-method-reference-in-java
 */

import java.util.function.DoubleSupplier;

public class DbSuplrEg5WithMethodRef {
    public static void main(String[] args) {
        DoubleSupplier supplier = Math::random;

        for (int i = 0; i < 5; ++i) {
            System.out.println("random number between 1 to 100: " + (supplier.getAsDouble() * 100));
        }
    }
}
