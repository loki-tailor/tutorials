package com.exceptions_and_errors;

import java.io.IOException;

public class CatchBlockBroaderException {
    public static void main(String[] args) {
        one();
        two();
    }

    public static void three() {
        try {
            throw new IOException();
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*- Unreachable catch block for IOException. It is already handled by the catch block for ExceptionJava(553648315) */
        // below gives above exception
        /*- catch (IOException e) { ]
             e.printStackTrace();
         } */
    }

    public static void two() {
        try {
            throw new IOException();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (Exception e) { // this is allowed, since we have handled sub-classed excecption first
            e.printStackTrace();
        }
    }

    public static void one(String... args) {
        try {
            throw new IOException();
        }
        /*- below gives: The exception IOException is already caught by the alternative ExceptionJava(553649001) */
        // catch (IOException | Exception ioe) {

        catch (IOException ioe) {
            ioe.printStackTrace();
            System.out.println();
        }
    }
}
