package com.logics;

/*-
    @created 26-01-21

    Reference: https://www.youtube.com/watch?v=UYMP-cMy_zg

    Problem Statement:

    Fizz Buzz is a very simple programming task, asked in software developer job interviews.

    A typical round of Fizz Buzz can be: 
        Write a program that prints the numbers from 1 to 100 
        and for multiples of ‘3’ print "Fizz" instead of the number 
        and for the multiples of ‘5’ print "Buzz". 

    1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, 
    Fizz Buzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26, 
    Fizz, 28, 29, Fizz Buzz, 31, 32, Fizz, 34, Buzz, Fizz, ...

    /, %, * operators have O(n^2) complexity
    +, - operators have O(n) complexity

*/

public class FizzBuzz {
    public static void main(String[] args) {
        save_modulo_computing_best_approach();
     
    }

    static void save_modulo_computing_best_approach() {
        int count3 = 0;
        int count5 = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i<=100; i++) {
            count3++;
            count5++;
            
            if(count3 == 3) { sb.append("Fizz "); count3 = 0; }
            if(count5 == 5) { sb.append("Buzz "); count5 = 0; }
            
            if(sb.length() == 0) System.out.println(i);
            else System.out.println(sb);                       
            
            sb.delete(0,sb.length());
        }
    }

    static void save_modulo_ops_2() {
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<100; i++) {
            
            if(i%3==0) sb.append("Fizz ");
            if(i%5==0) sb.append("Buzz");

            if(sb.length() == 0) System.out.println(i);
            else System.out.println(sb);

            sb.delete(0,sb.length());
        }
    }

    static void save_modulo_ops_1() {
        boolean flag3 = false;
        boolean flag5 = false;
        for(int i=0; i<100; i++) {
            flag3 = i%3 == 0;
            flag5 = i%5 == 0;
            System.out.println(flag3 && flag5 ? "Fizz Buzz" : (flag3 ? "Fizz" : (flag5 ? "Buzz" : i)));
        }
    }
 
    static void save_memory_sol() {
        for(int i=0; i<100; i++) {
            if(i%3==0 && i%5==0) // we can do simply i%15 as well, since internally 15 is divisible by both 3 & 5
                System.out.println("Fizz Buzz");
            else if (i%3 == 0)
                System.out.println("Fizz");
            else if (i%5 == 0) 
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }
} 