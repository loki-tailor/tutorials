package com.logics;

import java.util.concurrent.TimeUnit;

/***
 * 
 * @author lokeshwar
 * @created 06-03-21
 *
 */
public class Timer {

	public static long startTimer() {
		return System.nanoTime();
	}

	public static long stopTimer() {
		return System.nanoTime();
	}

	public static String timeDifference(long startTimer, long endTimer) {
		long diff = endTimer - startTimer;

		String diffStr = nanoToOnly_Hrs(diff) + " hrs : " + nanoToOnly_Mins(diff) + " mins : " + nanoToOnly_Secs(diff)
				+ " secs : " + nanoToOnly_Millis(diff) + " mills : " + nanoToOnly_nano(diff) + " nanos";

		return diffStr;
	}

	public static long nanoToOnly_Hrs(long nanoTime) {
		return TimeUnit.NANOSECONDS.toHours(nanoTime);
	}

	public static long nanoToOnly_Mins(long nanoTime) {
		return TimeUnit.NANOSECONDS.toMinutes(nanoTime)
				- TimeUnit.HOURS.toMinutes(TimeUnit.NANOSECONDS.toHours(nanoTime));
	}

	public static long nanoToOnly_Secs(long nanoTime) {
		return TimeUnit.NANOSECONDS.toSeconds(nanoTime)
				- TimeUnit.MINUTES.toSeconds(TimeUnit.NANOSECONDS.toMinutes(nanoTime));
	}

	public static long nanoToOnly_Millis(long nanoTime) {
		return TimeUnit.NANOSECONDS.toMillis(nanoTime)
				- TimeUnit.SECONDS.toMillis(TimeUnit.NANOSECONDS.toSeconds(nanoTime));
	}

	public static long nanoToOnly_nano(long nanoTime) {
		return nanoTime - TimeUnit.MILLISECONDS.toNanos(TimeUnit.NANOSECONDS.toMillis(nanoTime));
	}

	public static void main(String[] args) throws Exception {
		long a = Timer.startTimer();
		TimeUnit.MILLISECONDS.sleep(6111);
		long b = Timer.stopTimer();
		String d = Timer.timeDifference(a, b);
		System.out.println(d);
	}
}