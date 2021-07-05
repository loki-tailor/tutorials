package com.logics.t6;

public class _12 {
    public static void main(String[] args) {
        byte b1 = (byte) (127 + 21);
        System.out.println(b1);
    }
}

/*-

Explanation
127 + 21 = 148 = 00000000 00000000 00000000 10010100 

Above binary number is +ve, as left most bit is 0. 

Same binary number after type-casting to byte: 10010100, -ve number as left most bit is 1. 

10010100 = -108.

*/
