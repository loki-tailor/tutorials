package com.arrays;

/*- @created 14-05-21 */

public class ArrayDeclarations {
    public static void main(String... args) {
        // int[] a = new int[]; // compile error, size mandatory when constructing array using 'new' keyword
        int[] a = new int[2];
		a[0] = 1;
		a[1] = 2;
		System.out.println(java.util.Arrays.toString(a));

        // implicit casting accepted		
        char c = 'A';
        int[] a2 = new int[] { c };
        System.out.println(java.util.Arrays.toString(a2));
        
        // int[2] b = new int[2]; //  compile error, size in declaration not permitted
    }
}

/*-
OUTPUT

[1, 2]
[65]

*/