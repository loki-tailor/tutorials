package com.strings.intern;

public class C {
    public static void main(String[] args) {
        String s1 = "Hello".concat("World");
        String s3 = new String("HelloWorld");
        String s2 = s1.intern();

        boolean f1 = s1 == s2;
        boolean f2 = s1 == s3;
        boolean f3 = s2 == s3;

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);

    }
}

/*-

output:

false
false
false

*/
