package com.exceptions_and_errors;

/*
 * created @ Wed May 19 2021 6:36:15 am
 * ref @ 
 */

import java.util.List;
import java.util.Arrays;

public class ExceptionWhenCasting {
    public static void main(String[] args) {
        Object[] objs = { 1, "~2~", 3.0, 10.11d };

        List<Object> list = Arrays.asList(objs);

        list.stream().forEach(System.out::print);
        System.out.println();
        System.out.println();

        // for (Integer o : list) { // Type mismatch: cannot convert from element type
        // Object to IntegerJava(16777796)
        for (Object o : list) {
            // System.out.println((int) o); // string cannot be cast to java.lang.Integer
            System.out.println(o);
        }

    }
}

/*-

output: (when not failing) 

1~2~3.010.11

1
~2~
3.0
10.11

*/
