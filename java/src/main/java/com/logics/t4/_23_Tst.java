package com.logics.t4;

public class _23_Tst {
    public static void main(String[] args) {
        m(1);
    }

    private static void m(Object o) {
        System.out.println("object version");
    }

    private static void m(Number n) {
        System.out.println("Number version");
    }

    private static void m(Double n) {
        System.out.println("Double version");
    }
}

/*-

Explanation
There are 3 overloaded method m. Note all the numeric wrapper classes (Byte, Short, Integer, Long, Float and Double) extend from Number and Number extends from Object. 

Compiler either does implicit casting or Wrapping but not both. 1 is int literal, Java compiler can't implicit cast it to double and then box it to Double rather it boxes i to Integer and as Number is the immediate super class of Integer so Number version refers to Integer object.

Number version is printed on to the console.

*/