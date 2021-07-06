package com.logics.t9;
/*
 * created @ Mon Jul 05 2021 9:40:30 pm
 * ref @ 
 */

import java.util.function.IntUnaryOperator;

public class _32 {
    private static int AT_CAPACITY = 100;

    // below error: The type IntUnaryOperator is not generic; it cannot be
    // parameterized with arguments <Integer>Java(16777740)

    public int takeTicket(int currencCount, IntUnaryOperator<Integer> counter) {

        // public int takeTicket(int currencCount, IntUnaryOperator counter) {
        return counter.applyAsInt(currencCount);
    }

    public static void main(String[] args) {

        final _32 o = new _32();
        final int oldCount = 50;
        final int newCount = o.takeTicket(oldCount, t -> {
            if (t > AT_CAPACITY) { // error

                // if (_32.AT_CAPACITY > oldCount) { // runtime exception thrown if no error
                // i.e. lambdas can throw unchecked
                // exceptions
                throw new RuntimeException("Sorry, max has reached !");
            }
            return t + 1;
        });
        System.out.println(newCount);

    }
}

/*-

The code does not compile, so options A, B, and E are incorrect. The
IntUnaryOperator
functional interface is not generic, so the argument
IntUnaryOperator<Integer> in the takeTicket() does not compile, making option
D the correct answer. The lambda expression compiles without issue, making option C
incorrect. If the generic argument <Integer> was dropped from the argument declaration,
the class would compile without issue and output 51 at runtime, making option B the
correct answer.
*/
