package com.logics.t4;

public class _66_Tst {
    public static void main(String[] args) {
        final int i1 = 1;
        final Integer i2 = 1;
        final String s1 = ":ONE";

        String c1 = i1 + s1;
        String c2 = i2 + s1;
        // String c3 = i1 - s1; // compile error

        System.out.println(c1 == "1:ONE");
        System.out.println(c2 == "1:ONE");
    }
}

/*-

Explanation
Please note that Strings computed by concatenation at compile time, will be referred by String Pool during execution. Compile time String concatenation happens when both of the operands are compile time constants, such as literal, final variable etc.

Whereas, Strings computed by concatenation at run time (if the resultant expression is not constant expression) are newly created and therefore distinct.



For the statement, String str1 = i1 + s1;, i1 is a final variable of int type and s1 is a final variable of String type. Hence, `i1 + s1` is a constant expression which is computed at compile-time and results in String literal "1:ONE".

This means during compilation, Java compiler translates the statement

String str1 = i1 + s1;

to

String str1 = "1:ONE";

As "1:ONE" is a String literal, hence at runtime it will be referred by String Pool.



On the other hand, for the statement, String str2 = i2 + s1;, `i2 + s1` is not a constant expression because i2 is neither of primitive type nor of String type, hence it is computed at run-time and returns a non-pool String object "1:ONE".



As, str1 refers to String Pool object "1:ONE", hence `str1 == "1:ONE"` returns true, whereas str2 refers to non-Pool String object "1:ONE" and hence `str2 == "1:ONE"` returns false.

*/