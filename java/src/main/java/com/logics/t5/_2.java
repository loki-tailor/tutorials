package com.logics.t5;

public class _2 {
    public static void main(String[] args) {
        int a;
        try {
            int n = 10;
            int d = 0;
            a = n / d;
        } catch (ArithmeticException e) {
            a = 0;
        } catch (Exception e) {
            System.out.println("invalid calculation");
        }
        System.out.println("answer = " + a); // The local variable a may not have been initializedJava(536870963)

    }
}
