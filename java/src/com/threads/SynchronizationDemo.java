package com.threads;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class SynchronizationDemo {

	public static void main(String[] args) throws Exception {

		Thread t1 = new Thread(new MonitorThread());
		Thread t2 = new Thread(new ConfigThread());

		t1.start();
		t2.start();
		t1.join();
		t2.join();
	}

}

class MonitorThread implements Runnable {

	@Override
	public void run() {

		int temp = 0;
		while (temp < 100000) {
			// api hits
			if (temp == 100) {
				Status.failureDetected(temp);
			}
		}

	}
}

class ConfigThread implements Runnable {

	@Override
	public void run() {

		int temp = 0;
		while (temp < 100000) {
			// config validation
		}

	}
}

class Status {
	private static int failureCount = 0;
	private static int failureStartedTime = 0;
	private static int recoveryDoneTime = 0;
	private static int maxFailureAllowed = 500;

	public static synchronized int getFailureCount() {
		return failureCount;
	}

	public static synchronized void setFailureCount(int failureCount) {
		Status.failureCount = failureCount;
	}

	public static void failureDetected(int temp) {
		synchronized (Status.class) {
			// check for 1st failure or not
			if (failureCount == 0) {
				failureStartedTime = temp;
			}

			if (failureCount > maxFailureAllowed) {
				System.out.println("email sen");
				
			}
		}
	}

	public static synchronized void recoveryDone(int temp) {
		recoveryDoneTime = temp;
	}
}