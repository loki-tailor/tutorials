package com.logics.t6;

import java.util.ArrayList;
import java.util.List;

/*
 * created @ Sun Jun 27 2021 12:56:51 pm
 * ref @ 
 */

public class _68 {
    public static void main(String[] args) {

        Integer i = 10;

        List<Integer> list = new ArrayList<>();

        list.add(i);

        list.add(new Integer(10));

        list.add(i);

        // list.removeIf(i -> i == 10); // Lambda expression's parameter i cannot
        // redeclare another local variable
        // defined in an enclosing scope. Java(536871009)

        list.removeIf(j -> j == 10);
        System.out.println(list);

    }
}