package com.logics.t11._62;

interface Counter { int count = 10; }

public class Test {

	public static void main(String[] args) {
		Counter[] arr = new Counter[2]; // permitted as we are creating instance of array and not interface, and, saying that this array will contain instances which adher to IS-A relationship with 'Counter' interface

		for(Counter ctr  : arr) {
			System.out.print(ctr.count);
		}
	}

}