package com.logics.t8;

// anon class or lambda expr with this / super

public class Eg3 {

    private String s = "hi";

    public static void main(String[] args) {
        new Eg3().demo(args);
    }

    public void demo(String[] args) {

        // approach 1
        Runnable r1 = new Runnable() {
            private String s = "hello from inner class";

            @Override
            public void run() {
                System.out.println(this.s);
            }
        };
        new Thread(r1).start();

        // approach 2
        new Thread(//
                () -> System.out.println(this.s)) //
                        .start();

        // lambda expression: for super keyword, it refers to the super class of the enclosing contexts
        // anon class : super refers to the super class of the anon class itself
    }
}
