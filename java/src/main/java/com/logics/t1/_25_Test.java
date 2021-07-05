package com.logics.t1;

/**
 * _25_Test
 */
public class _25_Test {
    public static void main(String[] args) {
        byte var = 100;
        switch (var) {
            case 100:
                System.out.println("var is 100");
                break;
            case 200:
                System.out.println("var is 200");
                break;
            default:
                System.out.println("In default");
        }
    }
}

/*-

Explanation
case values must evaluate to the same type / compatible type as the switch expression can use. 

switch expression can accept following: 

char or Character 

byte or Byte 

short or Short 

int or Integer 

An enum only from Java 6 

A String expression only from Java 7 



In this case, switch expression [switch (var)] is of byte type.

byte range is from -128 to 127. But in case expression [case 200], 200 is outside byte range and hence compilation error.

*/