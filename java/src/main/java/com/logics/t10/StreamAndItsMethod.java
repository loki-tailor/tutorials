package com.logics.t10;
/*
 * created @ Tue Jul 06 2021 10:32:30 am
 * ref @ https://youtu.be/gq8VClqwqD4?list=PLUDxEIP1X623utgoHn0ptWwWSvUIefzNy&t=1097
 * 
 * ref @ peek not working with count() : https://mkyong.com/java8/java-8-stream-the-peek-is-not-working-with-count/
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.Temp;

public class StreamAndItsMethod {
    public static void main(String[] args) {

        // ================================================================================================================================================

        // finite stream
        Stream<Object> empty = Stream.empty(); // count = 0

        Stream<Integer> singleElements = Stream.of(1); // count = 1

        Stream<Integer> multipleElements = Stream.of(1, 2, 3, 4); // count = 4\

        System.out.println(multipleElements); // prints a hasCOde / address type value in console

        Temp.SEP();

        // ================================================================================================================================================

        // collections of stream

        List<Object> mix_list = List.of("a", 1, 2.3);

        List<Integer> int_list = List.of(1, 2, 3, 4);

        Stream<Object> stream = mix_list.stream();
        Stream<Integer> stream2 = int_list.stream();

        Stream<Object> parallelStream = mix_list.parallelStream();
        Stream<Integer> parallelStream2 = int_list.parallelStream();

        // ================================================================================================================================================

        // infinite stream

        Stream<Double> generate = Stream.generate(Math::random); // infinite stream // SUPPLIER
        generate.limit(10).forEach(System.out::println); // if limit is not there, then it will be in infinite loop

        Temp.SEP();

        // ================================================================================================================================================

        // infinite stream using iterate + supplier

        Stream<Integer> oddNumbers = Stream.iterate(1, val -> val + 2); // generates an infinite list // SUPPLIER
        oddNumbers.limit(10).forEach(System.out::println);

        Temp.SEP();

        // ================================================================================================================================================
        // finite stream using iterate + supplier + predicate

        Stream<Integer> oddNumbersTill_100 = Stream.iterate(1, curr_val -> curr_val <= 100, nxt_val -> nxt_val + 2);
        String collect = oddNumbersTill_100.map(v -> v.toString()).collect(Collectors.joining(" : "));
        System.out.println(collect);

        Temp.SEP();

        // ================================================================================================================================================

        // count() + peek() behaviour for streams

        List<String> l = Arrays.asList("A", "B", "C", "D");
        long count = l.stream().peek(System.out::println).count(); // count is 4 but no dataa is printed
        System.out.println(count);

        Temp.SEP();

        // if we want to use peek + count, then we ened to pass filter() or collect()
        // as compiler knows before hand if only peek() is present and then count : the
        // size of the list

        long count2 = l.stream().filter(val -> !val.isEmpty()).peek(System.out::println).count(); // will print the
                                                                                                  // values
        System.out.println(count2);

        Temp.SEP();

        // ================================================================================================================================================

    }
}
