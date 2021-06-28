package com.logics.t4;

public class _5_Tst {
    public static void main(String[] args) {
        Error e = new Error();

        boolean b1 = e instanceof Error;

        boolean b2 = e instanceof Throwable;

        boolean b3 = e instanceof Exception; // compile error

        boolean b4 = e instanceof RuntimeException; // compile error

        boolean b5 = new StackOverflowError() instanceof Error;

    }
}

/*-

Explanation
class Error extends Throwable, so `obj instanceof Error;` and `obj instanceof Throwable;` return true.

But Error class is not related to Exception and RuntimeException classes in multilevel inheritance and that is why Line n1 and Line n2 causes compilation error.
*/
