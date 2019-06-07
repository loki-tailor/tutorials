package test.threads;

// extends Thread
class ThreadExtends extends Thread {

	public void run() {
		System.out.println("My ThreadExtends is running...");
	}
}

// implements Runnable
class ThreadRunnableImplementation implements Runnable {

	@Override
	public void run() {
		System.out.println("My ThreadRunnableImplementation is running...");
	}
}

public class Demo_Threads {

	// anonymous block
	static Runnable staticThreadRunnable = new Runnable() {

		@Override
		public void run() {
			System.out.println("My staticThreadRunnable is running...");
		}
	};

	// lambda notaiton - threads
	static Runnable lambdaThreadrunnable = () -> {
		System.out.println("My lambdaThreadrunnable is running .. ");
	};

	public static void main1(String[] args) {

		Thread thread1 = new Thread(new ThreadRunnableImplementation(), "Thread-1");
		thread1.start();
		System.out.println("thread1.getName() - " + thread1.getName());

		Thread thread2 = new Thread(staticThreadRunnable, "Thread-2");
		thread2.start();
		System.out.println("thread2.getName() - " + thread2.getName());

		Thread thread3 = new Thread(lambdaThreadrunnable, "Thread-3");
		thread3.start();
		System.out.println("thread3.getName() - " + thread3.getName());

		Thread thread4 = new Thread(new ThreadExtends(), "Thread-4");
		thread4.start();
		System.out.println("thread4.getName() - " + thread4.getName());

		// thread.run() will also work and execute our code, however it will not
		// create a new separate thread, but start the exeuciton in the same
		// thread (i.e. the thread which executed the previous LOC

		// Hence it is recommended to use thread.start() instead of thread.run()
		// thread.run();
	}

	public static void main(String[] args) {

		System.out.println("Thread.currentThread().getName() - " + Thread.currentThread().getName());
		for (int i = 0; i < 10; i++) {
			new Thread("" + i) {
				public void run() {
					System.out.println("Thread - " + getName() + " is running..");
				}
			}.start();
		}
	}
}
