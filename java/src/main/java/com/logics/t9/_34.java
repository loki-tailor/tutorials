package com.logics.t9;
/*
 * created @ Mon Jul 05 2021 9:23:38 pm
 * ref @ 
 */

import java.util.Comparator;
import java.util.function.Consumer;

public class _34 {
    public static void main(String[] s) {
        // Predicate dash = c -> c.startsWith("-"); // compile error (method startsWtih
        // not defined for Object)
        // System.out.println(dash.test("-"));

        Consumer clear = x -> System.out.println(x); // no error
        clear.accept("pink");

        // Comparator<String> c = (String s, String t) -> 0; // compile error as 's' is already used in args
        // System.out.println(c.compare("s", "t"));
    }
}
