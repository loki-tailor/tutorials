package com.operators;

/*
 * created @ Sun Jun 20 2021 12:31:21 pm
 * ref @ https://stackoverflow.com/questions/2950319/is-null-check-needed-before-calling-instanceof#:~:text=No%2C%20a%20null%20check%20is,Java%20Language%20Specification%2C%20section%2015.20.
 */

public class InstanceofDemo2 {
    public static void test(A a) {
        System.out.println("inside <A>");
        System.out.println("a instance of A = " + (a instanceof A));
    }

    public static void test(B b) {
        // InstanceofDemo2.test(null);
        /*- above compile error: The method test(A) is ambiguous for the type InstanceofDemo2 */
        System.out.println("inside <B>");
        InstanceofDemo2.test((A) null);
    }

    public static void main(String[] args) {
        InstanceofDemo2.test((A) null);
        InstanceofDemo2.test((B) null);
    }
}

class A {
}

class B {

}

/*-
inside <A>
a instance of A = false
inside <B>
inside <A>
a instance of A = falses
*/