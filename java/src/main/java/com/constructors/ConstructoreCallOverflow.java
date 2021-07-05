package com.constructors;

class A {
    A() {
        this("loki"); // compile error: Recursive constructor invocation A()Java(134217865)

        System.out.println("Inside A()..");
    }

    A(String name) {
        this(); // compile error: Recursive constructor invocation A()Java(134217865)

        System.out.println("Inside A(string)...");
    }
}

public class ConstructoreCallOverflow {
    public static void main(String[] args) {
        new A();
    }
}
