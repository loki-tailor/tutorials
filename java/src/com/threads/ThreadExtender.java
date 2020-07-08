package com.threads;

class Extender extends Thread {

	int i = 0;

	public void run() {
		try {
			System.out.println("Index - " + i + ", running thread - " + Thread.currentThread().getId());
		} catch (Exception e) {
			System.out.println("Exception caught");
		}
	}
}

public class ThreadExtender {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			Extender e = new Extender();
			e.i = i;
			e.start();
		}
	}
}
