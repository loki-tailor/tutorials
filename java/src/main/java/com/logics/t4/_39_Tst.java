package com.logics.t4;

interface I01 {
    void m1();
}

public class _39_Tst extends Object implements I01 {

    protected void m1() {

    }

    public static void main(String[] args) {

    }
}

/*-

Explanation
void m1(); in interface I01 is equivalent to public abstract void m1(); So method m1() is implicitly public and abstract.

In java,  a class can extend from only one class but can implement multiple interfaces. Correct keywords are: extends and implements.

so class declaration is correct. 

As method m1() is implicitly public in I01, hence overriding method in Implementer class should also be public. But it is protected and hence compiler complains.
*/
