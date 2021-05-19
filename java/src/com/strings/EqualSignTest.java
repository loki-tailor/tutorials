package com.strings;
/*
 * created @ Mon May 17 2021 7:38:17 am
 * ref @ 
 */

public class EqualSignTest {

    public static void main(String[] args) {
        String s1 = "Hello".concat("World");
        String s3 = new String("HelloWorld");
        String s2 = s1.intern();

        boolean f1 = s1 == s2; // false
        boolean f2 = s1 == s3; // false
        boolean f3 = s2 == s3; // false

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
    }

    public static void one(String[] args) {
        String s1 = "Hello".concat("World");
        String s3 = new String("Hello World");
        String s2 = s1.intern();

        boolean f1 = s1 == s2; // true
        boolean f2 = s1 == s3; // false
        boolean f3 = s2 == s3; // false

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
    }
}
