package com.logics.t1;

public class _24_Test {
    public static void main(final String[] args) {
        int a = 100;
        System.out.println(-a++);
        System.out.println(a);

        // first we use value of a which is 100
        // then increment by 1 happens
    }
}

/*-

Explanation
First add parenthesis (round brackets) to the given expression: -a++.

There are 2 operators involved. unary minus and Postfix operator. Let's start with expression and value of a.



-a++; [a = 100]. 

-(a++); [a = 100] Postfix operator has got higher precedence than unary operator.   

-(100); [a = 101] Use the value of a (100) in the expression and after that increase the value of a to 101. 

-100; [a = 101] -100 is printed on to the console.

*/
