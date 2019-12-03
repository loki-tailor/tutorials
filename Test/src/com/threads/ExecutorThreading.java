package com.threads;

import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class A extends Thread {
    int tid = 0;

    public A(int i) {
	tid = i;
    }

    @Override
    public void run() {

	System.out.println("STARTED - Thread <" + Thread.currentThread().getName() + "> ; <" + Thread.currentThread().getId() + "> for ID - " + tid);

	while (true) {
	    try {
		System.out.println("Hello World - " + tid);
		TimeUnit.SECONDS.sleep(1);
	    } catch (InterruptedException e) {
		break;
	    }
	}

	System.out.println("STARTED - Thread <" + Thread.currentThread().getName() + "> ; <" + Thread.currentThread().getId() + ">");
    }
}

public class ExecutorThreading {

    public static void main(String[] args) throws Exception {

	System.out.println("STARTED - Thread <" + Thread.currentThread().getName() + "> ; <" + Thread.currentThread().getId() + ">");

	HashMap<Integer, Future<?>> list = new HashMap<>();

	ExecutorService es = Executors.newCachedThreadPool();

	for (int i = 0; i < 3; i++) {

	    Future<?> f = es.submit(new A(i));
	    list.put(i, f);
	    f = null;
	}

	Thread.sleep(60000);
	list.get(2).cancel(true);

	for (int i = 2; i < 6; i++) {

	    if (list.containsKey(i)) {
		continue;
	    } else {
		Future<?> f = es.submit(new A(i));
		list.put(i, f);
		f = null;
	    }
	}

	Thread.sleep(5000);
	list.get(5).cancel(true);

	System.out.println("END - Thread <" + Thread.currentThread().getName() + "> ; <" + Thread.currentThread().getId() + ">");
    }

}
