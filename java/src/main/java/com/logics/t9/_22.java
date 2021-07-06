package com.logics.t9;
/*
 * created @ Tue Jul 06 2021 8:44:35 am
 * ref @ 
 */

import java.util.function.ToDoubleBiFunction;

public class _22 {
    public static void main(String[] args) {

                // ##################################################################################################################################################################
        double d1 = 10.5;
        double d2 = 11.3;
        long l1 = 1L;
        Long l2 = Long.valueOf(l1);

        double dToL1 = l1; // no error
        double dToL2 = l2; // no error
        double dToL3 = (double) l1; // no error
        // double dToL4 = (Double) l1; // error : cannot cast from long to Double
        // double dToL5 = (Double) l2; // cannot cast from Long to Double
        double dToL6 = (double) d2; // no error


        Double res1 = d1 + d2;
        double res2 = d1 + d2;
        // int res3 = d1 + d2; // error

        // ##################################################################################################################################################################

        // ToDoubleBiFunction f1 = (Integer a, Double b) -> { int c; return b; }; // error as default of LHS is object

        ToDoubleBiFunction<Integer, Double> f1 = (Integer a, Double b) -> { int c; return b; }; // no error

        // ToDoubleBiFunction<Integer, Integer> f2 = (Integer a, Double b) -> { int c; return b; }; // error as Integer is expected 

        // ToDoubleBiFunction<Double, Double> f3 = (Integer a, Double b) -> { int c; return b; }; // error as Double is expected

        // ##################################################################################################################################################################

        ToDoubleBiFunction f2 = (h, i) -> (long) h; // no error
        
        ToDoubleBiFunction<Integer, Integer> f3 = (h, i) -> (long) h; // no error
        
        // ToDoubleBiFunction<Double, Double> f4 = (h, i) -> (long) h; // error: cannot cast from long to Double

        // ToDoubleBiFunction<Double, Double> f2 = (h, i) -> (Long) h; // error: cannot cast from Long to Double

        // ToDoubleBiFunction<Double, Double> f4 = (h, i) -> Long.valueOf(h); // error: valueOf does not accept Double

        // ##################################################################################################################################################################

        // ToDoubleBiFunction f4 = (String u, Object v) -> u.length() + v.length(); // compile error : Object.length() DOES NOT EXISTS

        // ##################################################################################################################################################################

        // ToDoubleBiFunction f5 = (x, y) -> { int z = 2; return y/2; }; // error, '/' operator is undefined for Object
        
        ToDoubleBiFunction<Double, Double> f5 = (x, y) -> { int z = 2; return y/z; }; // no error

        ToDoubleBiFunction<Integer, Integer> f6 = (x, y) -> { int z = 2; return y/z; }; // no error

        ToDoubleBiFunction<Integer, Double> f7 = (x, y) -> { int z = 2; return y/z; }; //  no error

        ToDoubleBiFunction<Double, Integer> f8 = (x, y) -> { int z = 2; return y/z; }; // -no erro

        // ##################################################################################################################################################################

        // ToDoubleBiFunction f9 = z -> z; // error, as Lambda expression's signature does not match the signature of the functional interface method applyAsDouble(Object, Object)Java(553648784)

        // ##################################################################################################################################################################

        // ToDoubleBiFunction  f10 = (double a, double b) -> a + b; // error as Object is the defautl param type for LHS
        
        // ToDoubleBiFunction<Double, Double>  f10 = (double a, double b) -> a + b; // error: interface useses 'Double' and not primitive double

        // ##################################################################################################################################################################

    }    
}
