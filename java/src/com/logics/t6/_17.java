package com.logics.t6;

import org.apache.commons.math3.exception.NullArgumentException;

public class _17 {
    private static String s;
    public static void main(String[] args) {
        try {
            System.out.println(s.length());
        }

        // catch(RuntimeException e) { e.printStackTrace(); }
        // catch(RuntimeException e) { e.printStackTrace(); } /*- writing twice gives error as : Unreachable catch block for RuntimeException. It is already handled by the catch block for RuntimeExceptionJava(553648315) */

        catch(NullPointerException | RuntimeException e) { System.out.println("DONE"); } 
        // catch(RuntimeException | NullArgumentException  e) { System.out.println("DONE"); } 
    }
}

/*- error: The exception NullPointerException is already caught by the alternative RuntimeExceptionJava(553649001) */


/*-

Explanation
NullPointerException extends RuntimeException and in multi-catch syntax we can't specify multiple Exceptions related to each other in multilevel inheritance.

*/