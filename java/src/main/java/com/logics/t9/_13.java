package com.logics.t9;
/*
 * created @ Mon Jul 05 2021 3:36:23 pm
 * ref @ 
 */

import java.util.function.DoubleSupplier;
import java.util.function.Supplier;

public class _13 {
    public static void main(String[] args) {
        DoubleSupplier d = null;

        Supplier<Double> d2 = null;

        /*-
        Both are functional interfaces in the java.util.function package, making option
        A true. Additionally, both lack parameters, making option B true. The major difference between
        the two is that Supplier<Double> takes the generic type Double, while the other
        does not take any generic type and instead uses the primitive double. For this reason,
        options C and E are true statements. For Supplier<Double> in option C, remember that
        the returned double value can be implicitly autoboxed to Double. Option D is the correct
        answer. Lambdas for Supplier<Double> can return a null value since Double is an
        object type, while lambdas for DoubleSupplier cannot; they can only return primitive
        double values.
        */
    }
}
