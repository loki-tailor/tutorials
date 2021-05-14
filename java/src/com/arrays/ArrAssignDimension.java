package com.arrays;

/*- @created 14-05-21 */

public class ArrAssignDimension {
    public static void main(String... args) {
        int[] a1 = new int[3];
        a1[0] = 1;
        a1[1] = 2;
        a1[2] = 3;
        System.out.println("a1 = " + java.util.Arrays.toString(a1));
        
        int[] b1 = new int[2];
        b1[0] = 4;
        b1[1] = 5;
        System.out.println("b1 = " + java.util.Arrays.toString(b1));        

        a1 = b1;
    }
}