package com.logics.t3;
/*
 * created @ Wed Jun 23 2021 8:11:39 am
 * ref @ 
 */

public class _43_Test {
    private static void m1() throws Exception {
        throw new Exception();
    }

    public static void main(String[] args) {
        try {
            m1();
        } finally {
            System.out.println("A");
        }
    }
}

/*-

Explanation
Method m1() throws Exception (checked) and it declares to throw it, so no issues with method m1().

But main() method neither provides catch handler nor throws clause and hence main method gives Compilation error.

Handle or Declare rule should be followed for checked exception if you are not re-throwing it.
*/