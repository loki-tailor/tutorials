package com.logics.t1;

import java.util.ArrayList;
import java.util.List;

public class _23_b_Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(100);
        list.add(200);
        list.remove(100); // runtime exception: index 100 fail
        // list.remove(new Integer(100)); // output [200,100,200]

        System.out.println(list);
    }
}
