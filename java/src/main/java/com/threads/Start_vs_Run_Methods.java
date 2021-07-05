package com.threads;

import java.util.concurrent.TimeUnit;

/*- @author lokeshwar @created June 18, 2020
*/

class Demo extends Thread {
    @Override
    public void run() {
	System.out.println(Thread.currentThread().getName());
    }
}

public class Start_vs_Run_Methods {
    public static void main(String[] args) throws InterruptedException {
	
	Demo d = new Demo();

	d.run(); // this will start the execution in the 'main' thread

	d.start(); // this will start the execution in the 'individual Thread-1' thread
	
	TimeUnit.SECONDS.sleep(3);
		
	d.start(); // throws java.lang.IllegalThreadStateException since thread is already started and can't re-start them
    }
}
