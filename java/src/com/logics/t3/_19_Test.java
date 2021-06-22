package com.logics.t3;

public class _19_Test {

    // 1
    private static void add(double d1, double d2) {
        System.out.println("double version: " + (d1 + d2));
    }

    // 2
    private static void add(Double d1, Double d2) {
        System.out.println("Double version: " + (d1 + d2));
    }

    public static void main(String[] args) {
        add(10, new Integer(10)); // mapped to 1

        add(10.0, 10); // mapped to 1

        // add(Double.valueOf(10), 10.0); // compile error : method is ambiguous

        add(Double.valueOf(10), Double.valueOf(10)); // mapped to 2

        add(Double.parseDouble("10"), Double.parseDouble("10")); // mapped to 1

        add(Double.parseDouble("10"), 10.0); // mapped to 1

        // add(Double.parseDouble("10"), Double.valueOf(10)); // compile error : method
        // is ambiguous

    }
}
