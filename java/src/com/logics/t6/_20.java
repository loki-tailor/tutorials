package com.logics.t6;

public class _20 {
    public static void main(String[] args) {
        final boolean flag;
        flag = true;
        while (flag) {
            System.out.println("good morning");
        }

        System.out.println("bye");
    }
}

/*-

Explanation
final boolean flag; flag = false; doesn't make flag a compile time constant. 

Compiler doesn't know flag's value at compile-time and hence it allows this syntax. 

At runtime, as boolean expression of while loop is false, loop doesn't execute even once and hence no output.
*/