package com.logics.tmisc;

class Baap {
	public int h = 4;

	public int getH() {
		System.out.println("Baap " + h);
		return h;
	}
}

public class ET1_63 extends Baap {
	public int h = 44;

	public int getH() {
		System.out.println("Beta " + h);
		return h;
	}

	public static void main(String[] args) {
		Baap b = new ET1_63();
		System.out.println(b.h + " " + b.getH());
		ET1_63 bb = (ET1_63) b;
		System.out.println(bb.h + " " + bb.getH());
	}
}
