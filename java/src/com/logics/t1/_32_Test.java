package com.logics.t1;

public class _32_Test {
    public static void main(String[] args) {
        /* INSERT */

        // Character var = 7; // goes to case 7
        // char var = 7; // goes to case 7

        // Character var = '7'; // does not go to case 7
        // char var = '7'; // does not go to case 7

        switch (var) {
            case 7:
                System.out.println("Lucky no. 7");
                break;
            default:
                System.out.println("DEFAULT");
        }
    }
}

/*-

Explanation
switch can accept primitive types: byte, short, int, char; wrapper types: Byte, Short, Integer, Character; String and enums.

In this case, all are valid values but only 3 executes "case 7:". case is comparing integer value 7.

NOTE: character seven, '7' is different from integer value seven, 7. So "char var = '7';" and "Character var = '7';" will print DEFAULT on to the console.

*/