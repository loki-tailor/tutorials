package com.threads;

class ThreadImplementer implements Runnable {

	int i = 0;

	@Override
	public void run() {
		

		try {
			System.out.println("Index - " + i + ", Thread - " + Thread.currentThread().getId() + " is running...");
		} catch (Exception e) {
			System.out.println("Exception caught !!");
		}
	}

}

public class ThreadsRunnable {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			ThreadImplementer threadImplementer = new ThreadImplementer();
			threadImplementer.i = i;
			new Thread(threadImplementer).start();
		}
	}
}
