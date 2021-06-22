package com.logics.t3;

import org.apache.http.util.CharArrayBuffer;

public class _12_Test {
    public static void main(String[] args) {
        m1(null);
    }

    static void m1(CharSequence s) {
        System.out.println("Charsequence");
    }

    static void m1(String s) {
        System.out.println("String");
    }

    // below will give compile error
    static void m1(CharArrayBuffer s) {
        System.out.println("Object");
    }

    static void m1(Object s) {
        System.out.println("Object");
    }
}

/*-

Explanation
Method m1 is overloaded to accept 3 different parameters: String, CharSequence and Object.

String implements CharSequence and Object is the super Parent class in Java. There is no conflict among the overloaded methods for the call m1(null) as it is mapped to the class lowest in hierarchy, which is String class. Hence, output will be "String".



Now if you add one more overloaded method, `static void m1(StringBuilder s) {...}` in the Test class, then `m1(null);` would cause compilation error as it would match to both m1(StringBuilder) and m1(String) methods. So m1(null) in that case would be ambiguous call and would cause compilation error.



For the same reason, System.out.println(null); causes compilation error as println method is overloaded to accept 3 reference types Object, String and char [] along with primitive types.

System.out.println(null); matches to both println(char[]) and println(String), so it is an ambiguous call and hence the compilation error.

*/