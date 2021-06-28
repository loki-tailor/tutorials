package com.logics.t6;

public class _63 {
    public static void main(String[] args) {

    }

    public static void one() {
        do {
            System.out.println(100);
        } while (true);
        System.out.println("bye"); // Unreachable codeJava(536871073)
    }

    public static void two() {
        do {
            System.out.println(100);
        } while (Boolean.TRUE);
        System.out.println("bye.."); // no compile error as while condition does not contain literal
    }

    public static void three() {
        final Boolean flag = true;
        do {
            System.out.println(100);
        } while (flag);
        System.out.println("bye.."); // no compile error as while condition does not contain literal
    }

    public static void four() {
        boolean flag = true;
        do {
            System.out.println(100);
        } while (flag);
        System.out.println("bye.."); // no compile error as while condition does not contain literal
    }

    private static void five() {
        final boolean flag = true;
        do {
            System.out.println(100);
        } while (flag);
        System.out.println("bye..."); // compile error: Unreachable codeJava(536871073)
    }
}

/*-

Boolean expression of do-while loop uses literal true (compile-time constant), hence Java compiler knows that this loop is an infinte loop.

It also knows that once at runtime Java Control enters an infinite loop, none of the statements after loop block will get executed. 

Hence it marks all the codes after infinite loop as Unreachable Code, which results in compilation error. 

If boolean variable was used instead of boolean literal, then this program would have compiled and executed successfully.

public class DoWhileTest1 { 
    public static void main(String[] args) { 
        boolean flag = true; 
        do { 
            System.out.println(100); 
        } while (flag); 
        
        System.out.println("Bye"); 
    } 
} 


Above program prints 100 in infinite loop and "Bye" never gets printed.

*/
