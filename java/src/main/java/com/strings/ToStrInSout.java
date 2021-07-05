package com.strings;

/*- @created 08-02-21

    This demonstrates that System.out.println(object.toString()),
    implicitly calls to 'toString()' method of the calling object.
*/

class FirstClass {
    public FirstClass() {
        System.out.println("Inside FirstClass default constructor");
    }

    @Override
    public String toString() { return "FirstClass toString()"; }
}

public class ToStrInSout {
    public static void main(String... args) {
        FirstClass obj = new FirstClass();
        System.out.println(obj); // this calls the toString() overidden method of the object
    }
}