package com.arrays;

/*-
    @created = 14-05-21
    @ref = https://www.geeksforgeeks.org/anonymous-array-java/
*/

public class AnonymousArray {
    public static void main(String... args) {

        // if assignment is given to below anon arrays
        // then, they don't remain anonymous

        // purpose of anonymous arrays to for usages of 1-time ONLY

        // anonymous int array 
        int[] arr_int = new int[] { 1, 2, 3, 4};  

        // anonymous char array 
        char[] arr_char = new char[] {'x', 'y', 'z'}; 

        // anonymous String array
        String[] arr_str = new String[] {"Geeks", "for", "Geeks"}; 

        // anonymous multidimensional array
        int[][] arr_2d_int = new int[][] { {10, 20}, {30, 40, 50} };

        sum(new int[] { 1, 2, 3, 4});

    }

    // one time use from the calling method to pass numbers for summation
    public static void sum(int[] num) {
        int sum = 0;
        for(int i : num)
            sum += i;
        System.out.println(java.util.Arrays.toString(num));
        System.out.println("sum = " + sum);
    }
}