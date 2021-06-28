package com.logics.t4;

class Base {
    public void m1() throws NullPointerException {
        System.out.println("Base: m1()");
    }
}

class Derived extends Base {
    public void m1() throws RuntimeException {
        System.out.println("Derived: m1()");
    }
}

public class _42_Tst {
    public static void main(String[] args) {
        Base b = new Derived();
        b.m1();
    }
}

/*-
Explanation
NullPointerException extends RuntimeException, but there are no overriding rules related to unchecked exceptions.

So, method m1() in Derived class correctly overrides Base class method.

Rest is simple polymorphism. obj refers to an instance of Derived class and hence obj.m1(); invokes method m1() of Derived class, which prints "Derived: m1()" to the console.
*/
