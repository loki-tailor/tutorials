package com.logics.t12._49;
/*
 * created @ Tue Jul 27 2021 8:00:56 am
 * ref @ 
 */

class A {
    @Override
    public String toString() {
        return null;
    }
}

public class Test {
    public static void main(String[] args) {
        String text = null;
        text += new A();
        System.out.println(text + " : " + text.length());
        text = null;

        // text = new A() + new A(); // error since atleast 1 should be string
        // text = new A() + new A() + text; // error for A concatetation
    }
}
