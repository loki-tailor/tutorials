package com.logics.sierra_book.ST_ch5._10;
/*
 * created @ Mon May 31 2021 5:57:22 am
 * ref @ 
 * 
 * OUTPUT:  1 1 3 3 9 9
 */

public class Circles {
    public static void main(String[] args) {
        int[] ia = { 1, 3, 5, 7, 9 };
        for (int x : ia) {
            for (int j = 0; j < 3; j++) {
                if (x > 4 && x < 8)
                    continue;
                System.out.print(" " + x);
                if (j == 1)
                    break;
                continue;
            }
            continue;
        }
    }
}
