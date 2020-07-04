package com.threads;

// Compiler version JDK 11.0.2

public class ThreadYield implements Runnable {

    private int i;

    public synchronized void run() {
	if (i % 5 != 0) {
	    i++;
	}
	for (int x = 0; x < 5; x++, i++) {
	    if (x > 1) {
		Thread.yield();
	    }
	}
	System.out.print(i + " ");
    }

    public static void main(String args[]) {
	System.out.println("Main Method");
	ThreadYield n = new ThreadYield();
	for (int x = 0; x < 10; x++) {
	    new Thread(n).start();
	}
    }
}

class ThreadOld implements Runnable {
    private int i;

    public synchronized void run() {
	for (int j = 0; j < 2; j++) {
	    System.out.println("Inside Run method of " + Thread.currentThread().getName() + " with i = " + i + ", j = " + j);
	    Thread.yield();

	}
	i++;
    }

    public static void mainOld(String args[]) {
	System.out.println("Hello, Dcoder!");
	ThreadYield t = new ThreadYield();
	for (int i = 0; i < 5; i++)
	    new Thread(t).start();
    }
}