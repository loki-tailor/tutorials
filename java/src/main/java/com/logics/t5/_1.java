package com.logics.t5;

public class _1 {
    public static void main(String[] args) {
        String ta = "A ";

        ta = ta.concat("B ");

        String tb = "C ";

        ta = ta.concat(tb);

        ta.replace('C', 'D');

        ta = ta.concat(tb);

        System.out.println(ta);

    }
}
