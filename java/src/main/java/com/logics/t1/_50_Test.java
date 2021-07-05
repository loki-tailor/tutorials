package com.logics.t1;

public class _50_Test {
    public static void main(String[] args) {

        double a = 10;
        int b = 20;
        double c = b;
        // int e = a; // type mimatch: compile error, cannot convert double to int

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        double[] d = new int[10];

    }
}

/*-

Explanation
int variable can easily be assigned to double type but double [] and int [] are not compatible. In fact, both are siblings and can't be assigned to each other, so Line 3 causes compilation failure.

*/
