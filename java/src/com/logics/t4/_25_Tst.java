package com.logics.t4;

class TestException extends Exception {
    public TestException() {
        super();
    }

    public TestException(String s) {
        super(s);
    }
}

public class _25_Tst {
    public void m1() throws Exception {
        throw new TestException();
    }
}

/*-
Explanation
Method m1() throws an instance of TestException, which is a checked exception as it extends Exception class.

So in throws clause we must provide:

1. Checked exception.

2. Exception of TestException type or it's super types (Exception, Throwable), Object cannot be used in throws clause.
*/