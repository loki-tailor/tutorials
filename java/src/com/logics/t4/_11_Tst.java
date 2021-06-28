package com.logics.t4;

public class _11_Tst {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        System.out.println(process(arr, 3, 8));
    }

    // no compile error
    // private static int process(int [] arr, int start, int end) { return 0; } //

    // below will give compile error
    // reason: primitive types can't have null assignments
    // private static int process(int [] arr, int start, int end) { return null; }

    // no compile error
    // private static int[] process(int [] arr, int start, int end) { return null; }

    // no compile error
    // private static String process(int [] arr, int start, int end) { return null;
    // }

    // no compile error
    private static String[] process(int[] arr, int start, int end) {
        return null;
    }
}

/*-

Explanation
It is clear from Line 5 that, method name should be process, it should be static method, it should accept 3 parameters (int[], int, int).

As process(arr, 3, 8) is passed as an argument of System.out.println method, hence process method's return type can be anything apart from void. println method is overloaded to accept all primitive types, char [], String type and Object type. int[] are String [] are of Object type.

In the given options, method specifying int as return type cannot return null as null can't be assigned to primitive type. int process(...) would cause compilation error.

*/
