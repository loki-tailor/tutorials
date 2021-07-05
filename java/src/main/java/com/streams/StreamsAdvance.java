package com.streams;
/*
 * created @ Sat Jul 03 2021 5:12:47 pm
 * ref @ 
 */

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;
import java.util.stream.Stream;

public class StreamsAdvance {
    public static void main(String[] args) {

        // ################################################################################################

        Stream<UUID> uuids = Stream.generate(UUID::randomUUID);

        // uuids.limit(10).forEach(System.out::println);

        // ################################################################################################

        Stream<BigInteger> res = Stream.iterate(BigInteger.ONE, num -> num.multiply(BigInteger.TWO));

        // res.limit(20).forEach(System.out::println);

        // ################################################################################################

        Stream<Character> alphabets = Stream.iterate('A', letter -> letter <= 'Z', letter -> (char) (++letter));
        // alphabets.forEach(System.out::print);

        // ################################################################################################
        Stream.Builder<String> builder = Stream.builder();
        builder.add("one");
        builder.add("abc");
        builder.add("abc");
        Stream<String> build = builder.build();
        build.forEach(System.out::println);
    }
}
