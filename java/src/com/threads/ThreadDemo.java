package com.threads;

/***
    @date = 08-04-21
    @ref = https://winterbe.com/posts/2015/04/07/java8-concurrency-tutorial-thread-executor-examples/
*/

public class ThreadDemo {
    public static void main(String... args) {
        Runnable task = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello " + threadName);
        };

        // running: approach-1
        // task.run();
        // above prints thread name as main

        // running: approach-2
        // Thread t = new Thread(task);
        // t.start();
        // above prints thread name as 'Thread-0'

        System.out.println("Done!");
    }
}