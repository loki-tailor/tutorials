package com.logics.t9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
 * created @ Tue Jul 06 2021 8:36:08 am
 * ref @ 
 */
public class _23 {
    public static void main(String[] args) {
        Stream<Object> of = Stream.of("1", 2);

        List<String> s = new ArrayList<>();
        s.add("a");

        Stream<String> parallel = s.stream().parallel();        
        Stream<String> parallelStream = s.parallelStream();
        

    }
}
