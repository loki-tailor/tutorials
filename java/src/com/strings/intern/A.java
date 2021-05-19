package com.strings.intern;

/*
 * created @ Mon May 17 2021 6:09:36 am
 * ref @ https://javarevisited.blogspot.com/2013/07/java-string-tutorial-and-examples-beginners-programming.html
 */

public class A {
    public static void main(String[] args) {
        String s0 = "Hello World";
        String s3 = new String("Hello World");

        boolean f1 = s0 == s3;

        System.out.println(f1);

    }
}

// output: false