package com.variables;
/*
 * created @ Tue May 18 2021 11:03:56 pm
 * ref @ https://javarevisited.blogspot.com/2015/03/what-is-effectively-final-variable-of.html#:~:text=A%20non%2Dfinal%20local%20variable,variable%20in%20an%20anonymous%20class.`
 */

public class EffectivelyFinalVar {

    public static void main(String[] args) {
        // effective_final_anon_class(args);
        effective_final_lamba_expr();
    }

    public static void effective_final_lamba_expr() {
        String nonFinal = "lokeshwar";
        Runnable r = () -> {
            System.out.println("value of effectively final variable = " + nonFinal);

            // compile error will come for below:
            // nonFinal = "tailor";
        };

        new Thread(r).start();
    }

    public static void effective_final_anon_class(String[] args) {
        String nonFinal = "i am a non-final local variable";
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("using non-final local variable inside anonymous class in java-8");
                System.out.println("value of non-final local variable = " + nonFinal);

                // compile error if we try to modify non-final variable inside a anonymous class
                // nonFinal = "I am not allowed to modify nonFinal";
                /*- above gives compie error = 
                    Local variable nonFinal defined in an enclosing scope must be final or effectively finalJava(536871575) 
                */
            }
        };

        Thread t = new Thread(r);
        t.start();
    }
}
