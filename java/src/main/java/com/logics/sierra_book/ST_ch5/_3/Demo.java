package com.logics.sierra_book.ST_ch5._3;
/*
 * created @ Wed May 19 2021 7:06:31 am
 * ref @ 
 */

public class Demo {
    public static void main(String[] args) {

        // Exception hierarchy as below

        // NumberFormatException
        // extends IllegalArgumentException
        // extends RuntimeException
        // extends Exception

        // even if we don't catch this hierarchy exception
        // no compile time error will come, as its unchecked (Runtime) exception

        try {
            int x = Integer.parseInt("two");
        } catch (NumberFormatException e1) {
            e1.printStackTrace();
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
        } catch (RuntimeException e3) { // NOT REQURIED
            e3.printStackTrace();
        } catch (Exception e) { // NOT RECOMMENDED
            e.printStackTrace();
        }
    }
}
