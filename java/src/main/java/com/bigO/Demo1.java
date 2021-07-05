package com.bigO;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.logics.Timer;

/***
 * 
 * @created 06-03-21
 * 
 *          ref: https://www.youtube.com/watch?v=v4cd1O4zkGw
 *
 */
public class Demo1 {
	public static void main(String[] args) {
		int limit = 100;
		List<Integer> list = Stream.iterate(1, n -> n + 1).limit(limit).collect(Collectors.toList());
		int x = limit - 1;

		long startTimerA = Timer.startTimer();
		System.out.println("Found " + x + " = " + contains(list, x));
		String aTime = Timer.timeDifference(startTimerA, Timer.stopTimer());

		long startTimerB = Timer.startTimer();
		printArr(list);
		String bTime = Timer.timeDifference(startTimerB, Timer.stopTimer());

		System.out.println("aTime = " + aTime);
		System.out.println("bTime = " + bTime);
	}

	public static boolean contains(List<Integer> list, int x) {
		for (Integer i : list) {
			if (i == x)
				return true;
		}
		return false;
	}

	public static void printArr(List<Integer> list) {
		for (Integer i : list) {
			for (Integer j : list) {
				System.out.println(i + "," + j);
			}
		}
	}

}
