package com.threads;

/**
 * 
 * @author lokeshwar created on 3-12-19 
 *         Page No. __ from book Sierra and Bates - OCA Java SE 8 Programmer I
 */

public class JCWombatThreadYield implements Runnable {
	private int i;
	public synchronized void run() {

		// Since it's synchronized, each thread will access it one at a time
		// Since it's being invoked on single instance of object, 
		// the value of i will be common accross all iterations from main() 

		// for every thread, the value of i%5 is initially incremented to 1
		// Thread-1: i would change to 1
		// Thread-2: i would change to 6 and so on..
		if(i%5 !=0) { i++; } 

		// value of i is incremented 4 times
		// Thread-1: i would change to 5
		// Thread-2: i would change to 10 and so on..
		for(int x=0; x<5; x++,i++){
			if(x>1) { Thread.yield(); }
		} // end of for
		System.out.print(i + " ");
	} // end of run() 

	public static void main(String args[]) {
		JCWombatThreadYield n = new JCWombatThreadYield();
		for(int x=100; x>0; x--) {
			new Thread(n).start();
		} // end of for
	} // end of main()
} // end of class
