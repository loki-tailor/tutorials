package com.logics.t6;

public class _46 {
    public static void main(String[] args) {

        String s1 = new String("Java"); // Line 3

        String s2 = "JaVa"; // Line 4

        String s3 = "JaVa"; // Line 5

        String s4 = "Java"; // Line 6

        String s5 = "Java"; // Line 7

        int i = 1; // Line 9

    }
}

/*-

Explanation
String s1 = new String("Java"); -> Creates 2 objects: 1 String Pool and 1 non-pool. s1 refers to non-pool object.

String s2 = "JaVa"; -> Creates 1 String pool object and s2 refers to it.

String s3 = "JaVa"; -> Doesn't create a new object, s3 refers to same String pool object referred by s2.

String s4 = "Java"; -> Doesn't create a new object, s4 refers to String Pool object created at Line 3.

String s5 = "Java"; -> Doesn't create a new object, s5 also refers to String Pool object created at Line 3.



So, at Line 9, 3 String objects are available in the HEAP memory: 2 String pool and 1 non-pool.

*/
