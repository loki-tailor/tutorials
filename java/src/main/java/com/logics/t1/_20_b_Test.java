package com.logics.t1;

public class _20_b_Test {
    public static void main(String[] args) {
        String fruit = "Mango";
        switch (fruit) {
            default:
                System.out.println("ANY FRUIT WILL DO");
            case "Apple":
                System.out.println("APPLE");
            case "Mango":
                System.out.println("MANGO");
            case "Banana":
                System.out.println("BANANA");
                break;
        }
    }
}

/*-

if fruit="Mango", then output = 

MANGO
BANANA

else if fruit = "mango", then output = 

ANY FRUIT WILL DO
APPLE
MANGO
BANANA

*/