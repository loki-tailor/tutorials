package com.logics.t9;
/*
 * created @ Mon Jul 05 2021 8:04:30 pm
 * ref @ 
 */

import java.util.ArrayList;

public class _17 {
    public static void main(String[] args) {
        var list = new ArrayList<String>();
        list.add("Monday");
        // list.add(String::new); // compile error
        list.add("Tuesday");
        list.remove(0);
        System.out.println(list.get(0));
    }
}

/*-

Line 8 does not compile. String::new is a constructor reference. This constructor reference
is equivalent to writing the lambda () -> new String(). It participates in deferred
execution. When it is executed later, it will return a String. It does not return a String on
line 8, though. The method reference is a Supplier<String>, which cannot be stored in
list. Since the code does not compile,

*/
