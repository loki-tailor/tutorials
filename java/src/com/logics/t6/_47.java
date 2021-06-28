package com.logics.t6;

public class _47 {
    static String msg;

    public static void main(String[] args) {
        String msg;
        if (args.length > 0) {
            msg = args[0];
        }
        System.out.println(msg); // The local variable msg may not have been initializedJava(536870963)

    }
}
