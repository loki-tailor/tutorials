package com.logics.sierra_book.ST_ch1._4;

/**
	@created 05-07-2020
*/

enum Animals {
	DOG("woof"), CAT("meow"), FISH("burble");
	String sound;
	Animals (String s) { sound = s; }
}

class TestEnum {
	static Animals a;
	public static void main(String[] args) {
		System.out.println(a.DOG.sound + " " + a.FISH.sound);
	}
}
