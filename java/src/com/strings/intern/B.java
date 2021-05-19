package com.strings.intern;

public class B {

    public static void main(String[] args) {
        String s1 = "Hello".concat("World");
        String s3 = new String("Hello World");

        boolean f1 = s1 == s3;

        System.out.println(f1);

    }
}

// output: false
