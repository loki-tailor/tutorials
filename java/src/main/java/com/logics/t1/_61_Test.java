package com.logics.t1;

import java.util.ArrayList;
import java.util.List;

public class _61_Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(110); // 1

        list.add(new Integer(110));

        list.add(110); // 3

        list.removeIf(i -> i == 110);

        System.out.println(list);

        Integer a = 10;
        Integer b = 10;
        System.out.println(a == b);

        Integer i5 = 200; // Integer object created through auto-boxing and value is NOT between -128 to
                          // 127, hence NOT referred by Integer pool.
        Integer i6 = 200; // Integer object created through auto-boxing and value is NOT between -128 to
                          // 127, hence NOT referred by Integer pool.
        System.out.println(i5 == i6); // Prints false
    }
}
