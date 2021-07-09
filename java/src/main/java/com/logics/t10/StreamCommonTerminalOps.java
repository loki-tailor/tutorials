package com.logics.t10;
/*
 * created @ Tue Jul 06 2021 11:08:34 am
 * ref @ https://youtu.be/gq8VClqwqD4?list=PLUDxEIP1X623utgoHn0ptWwWSvUIefzNy&t=1434
 */

import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

import com.Temp;

public class StreamCommonTerminalOps {
    public static void main(String[] args) {

        // ###################################################################################################

        // supplier of streams

        Supplier<Stream> stream_mix = () -> Stream.of("a", 10, 20, true, false);

        Supplier<Stream<Number>> stream_number = () -> Stream.of(1, 2, 310, 20.3, 44, 0.1212);

        Supplier<Stream<String>> stream_str = () -> Stream.of("loki", "lokeshwar", "tailor", "java", "scott", "_",
                "firefox");

        // ###################################################################################################

        // count
        long c1 = stream_mix.get().count();
        long c2 = stream_number.get().count();
        System.out.println(c1 + " : " + c2);
        Temp.SEP();

        // ###################################################################################################

        // min() & max() with streams
        Runnable runnable_err_msg = () -> System.out.println("not able to find what you asked");

        Optional<String> min = stream_str.get().min((str1, str2) -> str1.length());
        min.ifPresentOrElse(System.out::println, runnable_err_msg); // will print "firefox", guess last value in stream

        Optional<String> min2 = stream_str.get().min((str1, str2) -> str2.length());
        min.ifPresentOrElse(System.out::println, runnable_err_msg); // will print "firefox", guess last value in stream

        Optional<String> min3 = stream_str.get().min((str1, str2) -> -1);
        min3.ifPresentOrElse(System.out::println, runnable_err_msg); // will print "loki", guess 1st element in the
                                                                     // stream

        Optional<String> min4 = stream_str.get().min((str1, str2) -> 5);
        min4.ifPresentOrElse(System.out::println, runnable_err_msg); // will print "firefox", guess last value in stream

        Optional<String> min5 = stream_str.get().min((str1, str2) -> 0);
        min5.ifPresentOrElse(System.out::println, runnable_err_msg); // prints 1st element in the stream

        Optional<String> min6 = stream_str.get().min((a, b) -> 1);
        min6.ifPresentOrElse(System.out::println, runnable_err_msg); // firefox (last element in the stream)

        Optional<String> min7 = stream_str.get().min((a, b) -> a.length() - b.length()); // gets the element having
                                                                                         // minimum length
        min7.ifPresentOrElse(System.out::println, runnable_err_msg);

        Temp.SEP();

        // ###################################################################################################

        /*-
            Internally, stream.min() flow is as below:
        
            1. ReferencePipeline.class        
            @Override
            public final Optional<P_OUT> min(Comparator<? super P_OUT> comparator) {
                return reduce(BinaryOperator.minBy(comparator));
        
            }
        
            2. BinaryOperator.minBy(..) class
                public static <T> BinaryOperator<T> minBy(Comparator<? super T> comparator) {
                    Objects.requireNonNull(comparator);
                    return (a, b) -> comparator.compare(a, b) <= 0 ? a : b;
                }
        
            3. therefore, the lambda in compare method of Comparator is expecting a a integer value which could be <=0 then return a else return b
        
        */

    }
}
