package com.logics.t2;

public class _4_Test extends Tire {
    public static void main(String[] args) {

    }

    // void doStuff() { System.out.println(7/0);  } // no error

    // void doStuff() throws MyException { System.out.println(7/0);} // compile error

    // void doStuff() throws RuntimeException { System.out.println(7/0); } // no error

    // void doStuff() throws ArithmeticException { System.out.println(7/0); } // no error
}

class MyException extends Exception {

}

class Tire {
    void doStuff() {
    }
}
