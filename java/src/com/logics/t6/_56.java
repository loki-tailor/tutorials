package com.logics.t6;

public class _56 {

    public static void print() {
        System.out.println("static method");
    }

    public static void main(String[] args) {
        _56 obj = null;
        obj.print(); // warning: The static method print() from the type _56 should be accessed in a
                     // static wayJava(603979893)

    }
}

/*-
print() is static method of class Test. So correct syntax to call method print() is Test.print();

but static methods can also be invoked using reference variable: obj.print(); Warning is displayed in this case.

Even though obj has null value, we don't get NullPointerException as objects are not needed to call static methods.
*/
