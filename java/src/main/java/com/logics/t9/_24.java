package com.logics.t9;
/*
 * created @ Tue Jul 06 2021 5:40:05 am
 * ref @ 
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.function.Function;

public class _24 {
    public static void main(String[] args) {

        Function<Integer, ArrayList> f = n -> new ArrayList<>(n);

        f = ArrayList::new;

        // f = ArrayList::new(); // error

        // f = ArrayList::new(n); // error

        f = ArrayList::new[n]; // error
    }
}
