package com.logics.t6;

public class _13 {
    private static int[] arr; // NPE at runtime

    public static void main(String[] args) {

        // static int[] arr; only final allowed

        // int[] arr; // if condition arr not initialized error

        if (arr.length > 0 && arr != null)
            System.out.println(arr[0]);
    }
}
