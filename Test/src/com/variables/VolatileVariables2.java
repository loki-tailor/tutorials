package com.variables;

/**
 * 
 * @created July 03, 2020
 * 
 * Reference: https://www.youtube.com/watch?v=P3NYuC4dfzU
 *
 */

public class VolatileVariables2 {

    private static boolean running = false; // this will stuck the loop before 'Started'

    // private volatile static boolean running = false;

    public static void main(String[] args) throws InterruptedException {
	// start new thread
	new Thread(new Runnable() {

	    @Override
	    public void run() {

		// wait for running variable to become true
		while (!running) {
		    // System.out.println("running as - " + running);
		}
		System.out.println("Started");

		// wait for running variable to become false
		while (running) {
		    // System.out.println("running as - " + running);
		}
		System.out.println("Stopped");

	    }

	}).start();

	System.out.println("Starting");
	Thread.sleep(1000);
	running = true;

	Thread.sleep(1000);
	System.out.println("Stopping");
	running = false;
    }
}
