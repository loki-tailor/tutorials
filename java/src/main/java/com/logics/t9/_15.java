package com.logics.t9;
/*
 * created @ Mon Jul 05 2021 7:40:09 pm
 * ref @ 
 */

import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

import com.ctc.wstx.shaded.msv_core.datatype.xsd.IntegerType;

public class _15 {
    public static void main(String[] args) {

        // __________- transformer = x -> x;

        // Function<Integer, Integer> transformer = x -> x; // compile error for
        // mapToInt

        // UnaryOperator<Integer> transformer = x -> x; // this is ok, but will give
        // compile error if used in mapToInt

        ToIntFunction<Integer> transformer = x -> x; // A-ok

        // IntUnaryOperator transformer = x -> x; // this is ok, but will give compile
        // error when used with mapToInt

        var prime = List.of(3, 11, 1, 4, 1, 5, 9) //
                .stream()//
                .limit(3)//
                .peek(s -> {
                }) //
                .mapToInt(transformer) //
                .peek(s -> {
                }) //
                .sum(); //
        System.out.println(prime);
    }
}

/*
 * The first line that contains the lambda expression will actually compile with
 * any of the functional interfaces listed in the options. The stream operation,
 * though, will compile only if ToIntFunction<Integer> is used. It requires this
 * functional interface, which takes a generic argument and returns int. For
 * this reason, option C is correct. Option F is incorrect because sum() on an
 * IntStream returns an int, not an OptionalInt. Note that the peek() operations
 * in this stream have no effect.
 */
