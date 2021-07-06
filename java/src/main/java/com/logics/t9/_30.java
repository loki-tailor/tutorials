package com.logics.t9;
/*
 * created @ Tue Jul 06 2021 4:57:23 am
 * ref @ 
 */

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class _30 {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("tire-");

        List<String> list = new LinkedList<>();

        Deque<String> queue = new ArrayDeque<>();

        queue.push("wheel-");

        // Stream.of(set, list, queue).flatMap(x -> x).forEach(System.out::println); //
        // error

        Stream.of(set, list, queue).flatMap(x -> x.stream()).forEach(System.out::print);

    }
}

/*-
The flatMap() method works with streams rather than collections. Line 18 is problematic
because the return value is not a stream. Since the code does not compile, option F is
correct. If the lambda was changed to x -> x.stream(), option B would be the answer.
*/
