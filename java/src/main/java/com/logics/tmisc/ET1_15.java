package com.logics.tmisc;
/*
 * created @ Thu Aug 19 2021 8:21:31 am
 * ref @ 
 */

public class ET1_15 {

	public void init_data(String[] arr) {
		int ind = 0;
		for (String str : arr) {
			str.concat(str + " " + ind); // concat will give NPE if arr values are not initialize hence, str is nulls
			String tmp = str + " " + ind;
			ind++;
		}
	}

	public void printData(String[] arr) {
		for (String str : arr) {
			System.out.println(str);
		}
	}

	public static void main(String[] args) {
		String s = null;
		s.concat("a");
		ET1_15 obj = new ET1_15();
		String[] arr = new String[2];
		obj.init_data(arr);
		obj.printData(arr);
	}
}
