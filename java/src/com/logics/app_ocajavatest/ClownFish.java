package com.logics.app_ocajavatest;

/**
	created @ 22-01-2020
	@author lokeshwar
*/

interface Aquatic {
	public default int getNumberOfGills(int input) { return 2; }
}

public class ClownFish implements Aquatic {
	public String getNumberOfGills() { return "4"; }
	//public String getNumberOfGills(int input) { return "6"; }
	public static void main(String[] args) {
		System.out.println(new ClownFish().getNumberOfGills(-1));
		System.out.println(new ClownFish().getNumberOfGills());
	}
}