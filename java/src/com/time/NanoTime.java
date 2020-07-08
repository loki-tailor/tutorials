package com.time;

public class NanoTime {

	public static void main(String[] args) throws Exception {

		long startTime = System.nanoTime();
		Thread.sleep(2000);
		long endTime = System.nanoTime();
		System.out.println(startTime);
		System.out.println(endTime);
		long diff = endTime - startTime;
		long diffInSec = diff / 1000000000;
		System.out.println(diff);
		System.out.println(diffInSec);

	}

}
