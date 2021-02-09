package com.casting;

/*- @created 09-02-21

In general, collections like 'ArrayList' can hold objects but not primitives.

*/

public class AutoboxingDemo {
    public static void main(String... args) {
        Integer a = 100;
        Integer b = a;

        System.out.println("a =  " + a + ", b = " + b  + ", a.hashCode = " + a.hashCode() + ", b.hashCode = " + b.hashCode() + ", a==b @ " + (a==b));

        a++;

        System.out.println("a =  " + a + ", b = " + b  + ", a.hashCode = " + a.hashCode() + ", b.hashCode = " + b.hashCode() + ", a==b @ " + (a==b));
    }
}

/*- OUTPUT:

a =  100, b = 100, a.hashCode = 100, b.hashCode = 100, a==b @ true
a =  101, b = 100, a.hashCode = 101, b.hashCode = 100, a==b @ false

*/