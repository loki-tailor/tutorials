package com.logics.t11._43;

public class Test {
    public static void main(String[] args) {
        String s1 = "OCP";
        String s2 = "ocp";

        // System.out.println(s1.equals(s2.toUpper())); // error: toUpperCase is the
        // actual methd

        System.out.println(s1.contentEquals(s2)); // no error, but prints FALSE in console.

        System.out.println(s1.equalsIgnoreCase(s2)); // true

        System.out.println(s1.length() == s2.length()); // true

        System.out.println(s1.equals(s2)); // no error, but prints false

        // System.out.println(s1.equals(s2.toLower())); // err: toLowerCase() is the actual method

    }
}
